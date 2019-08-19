package com.jyl.game.web.utils.chectIf;

import com.jyl.game.web.utils.robot.RobotUtils;
import com.jyl.game.web.utils.spilt.SpiltRtoL;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;

/**
 * @Auther: pc
 * @Date: 2019-08-09 22:38
 * @Description: 识别包裹垃圾钟
 */
public class CharIf01 {

    public static int ii;

    private static int temp;
    //幸运钟
    private static int num1 = 1;
    //乾坤袋垃圾钟
    private static int num2 = 2;
    //背包垃圾钟
    private static int num3 = 3;
    //乾坤袋混元金斗
    private static int num4 = 4;

    public static void main(String[] args) throws AWTException, IOException, URISyntaxException {

        charExtForIf2("混元金斗朱砂", 121, 279);

    }

    /***
     * 背包垃圾钟识别
     */
    public static void charExtForIf(String param, int x, int y) throws AWTException {

        Robot robot = new Robot();
        String str[] = {"财", "帛", "会", "禄", "禄", "存", "华", "盖", "智", "辩", "力", "量", "翻", "羽", "宗", "气", "孔", "武", "越", "影", "聪", "颖", "纳", "气", "蛮", "力", "奔", "宵", "聪", "慧", "铁", "骨", "延", "寿", "定", "慧", "默", "祷", "混", "茫", "混", "扰", "眩", "怖", "眩", "疑", "翱", "翔", "鸣", "响", "入", "定", "定", "然", "之", "咒", "强", "健", "落", "吞", "焰", "息", "尘", "禁", "尘", "无", "双", "无", "妄", "无", "量", "清", "逸", "清", "韵", "响", "朗", "驰", "骋", "翱", "翔", "眩", "疑", "眩", "怖", "默", "吟"};
        String str6[] = {"财", "帛", "会", "禄", "禄", "存", "华", "盖", "智", "辩", "力", "量", "翻", "羽", "宗", "气", "孔", "武", "越", "影", "聪", "颖", "纳", "气", "蛮", "力", "奔", "宵", "聪", "慧", "铁", "延", "寿", "之", "咒"};
        String str1[] = {"东", "皇", "钟"};
        //特殊的东皇垃圾钟
        String str4[] = {"智", "辩", "财", "帛", "会", "禄"};
        String str5[] = {"玲", "珑", "心"};
        String params = param;

        if (param.length() <= 2) {
            System.out.println("识别失败");
            params = "东皇钟财帛";
        }
        SpiltRtoL.test(params);
        //倒数后两个
        String param1 = SpiltRtoL.getParam1();
        String param2 = SpiltRtoL.getParam2();

        //正数前三个
        String param3 = SpiltRtoL.getParam3();
        String param4 = SpiltRtoL.getParam4();
        String param5 = SpiltRtoL.getParam5();

        //倒数后两个
        /**
         * 包含所有值钱幸运钟
         */
        boolean contains1 = Arrays.asList(str).contains(param1);
        boolean contains2 = Arrays.asList(str).contains(param2);

        /**
         * 玲珑心幸运钟
         */
        boolean contains13 = Arrays.asList(str6).contains(param1);
        boolean contains14 = Arrays.asList(str6).contains(param2);

        //正数前三个 是否为东皇钟
        boolean contains3 = Arrays.asList(str1).contains(param3);
        boolean contains4 = Arrays.asList(str1).contains(param4);
        boolean contains5 = Arrays.asList(str1).contains(param5);

        //正数前三个 是否为玲珑心
        boolean contains6 = Arrays.asList(str5).contains(param3);
        boolean contains7 = Arrays.asList(str5).contains(param4);
        boolean contains8 = Arrays.asList(str5).contains(param5);

        //特殊东皇幸运钟
        boolean contains11 = Arrays.asList(str4).contains(param1);
        boolean contains12 = Arrays.asList(str4).contains(param1);

        //1.判断是否为东皇钟
        if (contains3 == true | contains4 == true | contains5 == true) {
            if (contains11 == true | contains12 == true) {
                System.out.println("东皇幸运钟");
                CharIf01.setTemp(getNum1());
            } else {
                System.out.println("东皇垃圾钟1，放入乾坤袋");
            }

            //如果不是东皇钟，那就是混元金斗或者玲珑心
        } else {
            //1.是否为玲珑心
            if (contains6 == true | contains7 == true | contains8 == true) {
                //判断是否为玲珑心幸运钟
                /**
                 * 玲珑心幸运钟 ，不包含抗性和强控制钟
                 */
                if (contains13 == true | contains14 == true) {
                    //幸运钟
                    System.out.println("玲珑心幸运钟");
                    CharIf01.setTemp(getNum1());
                } else {
                    //垃圾钟
                    System.out.println("玲珑心垃圾钟");
                }
            } else {
                //混元金斗
                //是否为混元金斗幸运钟
                /**
                 * 混元金斗幸运钟包含 抗性 强控制 幸运钟
                 */
                if (contains1 == true | contains2 == true) {
                    //幸运钟
                    System.out.println("混元金斗幸运钟");
                    CharIf01.setTemp(getNum1());
                } else {
                    //垃圾钟
                    System.out.println("混元金斗垃圾钟");
                }

            }
        }


//            //混元玲珑幸运钟
//            if (contains1 == true | contains2 == true) {
//                System.out.println("混元玲珑幸运钟");
//                CharIf01.setTemp(getNum1());
//            } else {
//                System.out.println("混元玲珑垃圾钟2，放入乾坤袋");
//            }

    }

    /**
     * 第一次乾坤袋转化识别
     */
    public static void charExtForIf2(String param, int x, int y) throws AWTException, IOException, URISyntaxException {

        Robot robot = new Robot();
        String str[] = {"财", "帛", "会", "禄", "禄", "存", "华", "盖", "智", "辩", "力", "量", "翻", "羽", "宗", "气", "孔", "武", "越", "影", "聪", "颖", "纳", "气", "蛮", "力", "奔", "宵", "聪", "慧", "铁", "骨", "延", "寿", "定", "慧", "默", "祷", "混", "茫", "混", "扰", "眩", "怖", "眩", "疑", "翱", "翔", "鸣", "响", "入", "定", "定", "然", "之", "咒", "强", "健", "落", "吞", "焰", "息", "尘", "禁", "尘", "无", "双", "无", "妄", "无", "量", "清", "逸", "清", "韵", "响", "朗", "驰", "骋", "翱", "翔", "眩", "疑", "眩", "怖", "默", "吟"};
        String str6[] = {"财", "帛", "会", "禄", "禄", "存", "华", "盖", "智", "辩", "力", "量", "翻", "羽", "宗", "气", "孔", "武", "越", "影", "聪", "颖", "纳", "气", "蛮", "力", "奔", "宵", "聪", "慧", "铁", "延", "寿", "之", "咒"};
        String str1[] = {"东", "皇", "钟"};
        //特殊的东皇垃圾钟
        String str4[] = {"智", "辩", "财", "帛", "会", "禄"};
        String str5[] = {"玲", "珑", "心"};
        String params = param;

        if (param.length() <= 2) {
            System.out.println("识别失败");
            params = "东皇钟财帛";
        }
        SpiltRtoL.test(params);
        //倒数后两个
        String param1 = SpiltRtoL.getParam1();
        String param2 = SpiltRtoL.getParam2();

        //正数前三个
        String param3 = SpiltRtoL.getParam3();
        String param4 = SpiltRtoL.getParam4();
        String param5 = SpiltRtoL.getParam5();

        //倒数后两个
        /**
         * 包含所有值钱幸运钟
         */
        boolean contains1 = Arrays.asList(str).contains(param1);
        boolean contains2 = Arrays.asList(str).contains(param2);

        /**
         * 玲珑心幸运钟
         */
        boolean contains13 = Arrays.asList(str6).contains(param1);
        boolean contains14 = Arrays.asList(str6).contains(param2);

        //正数前三个 是否为东皇钟
        boolean contains3 = Arrays.asList(str1).contains(param3);
        boolean contains4 = Arrays.asList(str1).contains(param4);
        boolean contains5 = Arrays.asList(str1).contains(param5);

        //正数前三个 是否为玲珑心
        boolean contains6 = Arrays.asList(str5).contains(param3);
        boolean contains7 = Arrays.asList(str5).contains(param4);
        boolean contains8 = Arrays.asList(str5).contains(param5);

        //特殊东皇幸运钟
        boolean contains11 = Arrays.asList(str4).contains(param1);
        boolean contains12 = Arrays.asList(str4).contains(param1);

        //1.判断是否为东皇钟
        if (contains3 == true | contains4 == true | contains5 == true) {
            if (contains11 == true | contains12 == true) {
                System.out.println("东皇幸运钟");
                //右键操作  坐标为乾坤袋坐标
                RobotUtils.MouseRight(x + 236, y + 266, 500);
            } else {
                System.out.println("东皇垃圾钟1");
                //1.点击转化  328 450
                RobotUtils.moseLeft(x + 328, y + 450, 500);
                RobotUtils.moseLeft(x + 328, y + 450, 500);
                //2.确定按钮
                RobotUtils.moseLeft(x + 349, y + 351, 500);
                CharIf01.setTemp(getNum2());
            }

//        } else {
//            //混元玲珑幸运钟
//            if (contains1 == true | contains2 == true) {
//                System.out.println("混元玲珑幸运钟");
//                //右键操作  坐标为乾坤袋坐标
//                RobotUtils.MouseRight(x + 236, y + 266, 500);
//            } else {
//                System.out.println("混元玲珑垃圾钟2");
//                //1.点击转化  328 450
//                RobotUtils.moseLeft(x + 328, y + 450, 500);
//                RobotUtils.moseLeft(x + 328, y + 450, 500);
//                //2.确定按钮
//                RobotUtils.moseLeft(x + 349, y + 351, 500);
//                CharIf01.setTemp(getNum2());
//            }
//        }
            //如果不是东皇钟，那就是混元金斗或者玲珑心
        } else {
            //1.是否为玲珑心
            if (contains6 == true | contains7 == true | contains8 == true) {
                //判断是否为玲珑心幸运钟
                /**
                 * 玲珑心幸运钟 ，不包含抗性和强控制钟
                 */
                if (contains13 == true | contains14 == true) {
                    //幸运钟
                    System.out.println("玲珑心幸运钟");
                    //右键操作  坐标为乾坤袋坐标
                    RobotUtils.MouseRight(x + 236, y + 266, 500);
                } else {
                    //垃圾钟
                    System.out.println("玲珑心垃圾钟");
                    //1.点击转化  328 450
                    RobotUtils.moseLeft(x + 328, y + 450, 500);
                    RobotUtils.moseLeft(x + 328, y + 450, 500);
                    //2.确定按钮
                    RobotUtils.moseLeft(x + 349, y + 351, 500);
                    CharIf01.setTemp(getNum2());
                }
            } else {
                //混元金斗
                //是否为混元金斗幸运钟
                /**
                 * 混元金斗幸运钟包含 抗性 强控制 幸运钟
                 */
                if (contains1 == true | contains2 == true) {
                    //幸运钟
                    System.out.println("混元金斗幸运钟");
                    //右键操作  坐标为乾坤袋坐标
                    RobotUtils.MouseRight(x + 236, y + 266, 500);
                } else {
                    //垃圾钟
                    System.out.println("混元金斗垃圾钟");
                    CharIf01.setTemp(getNum4());

                }

            }
        }


    }

    /**
     * 循环乾坤袋转化识别
     */
    public static void charExtForIf3(String param, int x, int y) throws AWTException, IOException, URISyntaxException {

        Robot robot = new Robot();

        String str[] = {"财", "帛", "会", "禄", "禄", "存", "华", "盖", "智", "辩", "力", "量", "翻", "羽", "宗", "气", "孔", "武", "越", "影", "聪", "颖", "纳", "气", "蛮", "力", "奔", "宵", "聪", "慧", "铁", "骨", "延", "寿", "定", "慧", "默", "祷", "混", "茫", "混", "扰", "眩", "怖", "眩", "疑", "翱", "翔", "鸣", "响", "入", "定", "定", "然", "之", "咒", "强", "健", "落", "吞", "焰", "息", "尘", "禁", "尘", "无", "双", "无", "妄", "无", "量", "清", "逸", "清", "韵", "响", "朗", "驰", "骋", "翱", "翔", "眩", "疑", "眩", "怖", "默", "吟"};
        String str6[] = {"财", "帛", "会", "禄", "禄", "存", "华", "盖", "智", "辩", "力", "量", "翻", "羽", "宗", "气", "孔", "武", "越", "影", "聪", "颖", "纳", "气", "蛮", "力", "奔", "宵", "聪", "慧", "铁", "延", "寿", "之", "咒"};
        String str1[] = {"东", "皇", "钟"};
        //特殊的东皇垃圾钟
        String str4[] = {"智", "辩", "财", "帛", "会", "禄"};
        String str5[] = {"玲", "珑", "心"};
        String params = param;

        if (param.length() <= 2) {
            System.out.println("识别失败");
            params = "东皇钟财帛";
        }
        SpiltRtoL.test(params);
        //倒数后两个
        String param1 = SpiltRtoL.getParam1();
        String param2 = SpiltRtoL.getParam2();

        //正数前三个
        String param3 = SpiltRtoL.getParam3();
        String param4 = SpiltRtoL.getParam4();
        String param5 = SpiltRtoL.getParam5();

        //倒数后两个
        /**
         * 包含所有值钱幸运钟
         */
        boolean contains1 = Arrays.asList(str).contains(param1);
        boolean contains2 = Arrays.asList(str).contains(param2);

        /**
         * 玲珑心幸运钟
         */
        boolean contains13 = Arrays.asList(str6).contains(param1);
        boolean contains14 = Arrays.asList(str6).contains(param2);

        //正数前三个 是否为东皇钟
        boolean contains3 = Arrays.asList(str1).contains(param3);
        boolean contains4 = Arrays.asList(str1).contains(param4);
        boolean contains5 = Arrays.asList(str1).contains(param5);

        //正数前三个 是否为玲珑心
        boolean contains6 = Arrays.asList(str5).contains(param3);
        boolean contains7 = Arrays.asList(str5).contains(param4);
        boolean contains8 = Arrays.asList(str5).contains(param5);

        //特殊东皇幸运钟
        boolean contains11 = Arrays.asList(str4).contains(param1);
        boolean contains12 = Arrays.asList(str4).contains(param1);

        //1.判断是否为东皇钟
        if (contains3 == true | contains4 == true | contains5 == true) {
            if (contains11 == true | contains12 == true) {
                System.out.println("东皇幸运钟");
                //右键操作  坐标为乾坤袋坐标
                RobotUtils.MouseRight(x + 236, y + 266, 500);
            } else {
                System.out.println("东皇垃圾钟1");
                //1.点击转化  328 450
                RobotUtils.moseLeft(x + 328, y + 450, 500);
                RobotUtils.moseLeft(x + 328, y + 450, 500);
                //2.确定按钮
                RobotUtils.moseLeft(x + 349, y + 351, 500);
                CharIf01.setTemp(getNum3());
            }

            //如果不是东皇钟，那就是混元金斗或者玲珑心
        } else {
            //1.是否为玲珑心
            if (contains6 == true | contains7 == true | contains8 == true) {
                //判断是否为玲珑心幸运钟
                /**
                 * 玲珑心幸运钟 ，不包含抗性和强控制钟
                 */
                if (contains13 == true | contains14 == true) {
                    //幸运钟
                    System.out.println("玲珑心幸运钟2");
                    //右键操作  坐标为乾坤袋坐标
                    RobotUtils.MouseRight(x + 236, y + 266, 500);
                } else {
                    //垃圾钟
                    System.out.println("玲珑心垃圾钟2");
                    //1.点击转化  328 450
                    RobotUtils.moseLeft(x + 328, y + 450, 500);
                    RobotUtils.moseLeft(x + 328, y + 450, 500);
                    //2.确定按钮
                    RobotUtils.moseLeft(x + 349, y + 351, 500);
                    CharIf01.setTemp(getNum3());
                }
            } else {
                //混元金斗
                //是否为混元金斗幸运钟
                /**
                 * 混元金斗幸运钟包含 抗性 强控制 幸运钟
                 */
                if (contains1 == true | contains2 == true) {
                    //幸运钟
                    System.out.println("混元金斗幸运钟2");
                    //右键操作  坐标为乾坤袋坐标
                    RobotUtils.MouseRight(x + 236, y + 266, 500);
                } else {
                    //垃圾钟
                    System.out.println("混元金斗垃圾钟2");
                    CharIf01.setTemp(getNum4());
                }

            }
        }
//        } else {
//            //混元玲珑幸运钟
//            if (contains1 == true | contains2 == true) {
//                System.out.println("混元玲珑幸运钟");
//                //右键操作  坐标为乾坤袋坐标
//                RobotUtils.MouseRight(x + 236, y + 266, 500);
//            } else {
//                System.out.println("混元玲珑垃圾钟2");
//                //1.点击转化  328 450
//                RobotUtils.moseLeft(x + 328, y + 450, 500);
//                RobotUtils.moseLeft(x + 328, y + 450, 500);
//                //2.确定按钮
//                RobotUtils.moseLeft(x + 349, y + 351, 500);
//                CharIf01.setTemp(getNum3());
//            }
//        }

//        if (是幸运钟){
//            if (是否包含力，并且是东皇钟){
//                垃圾钟
//            }else{
//                幸运钟
//            }
//        }else 垃圾钟{
//            if (是混元金斗){
//                加入一个一起转
//            }else {
//                继续转钟
//            }
//        }

//        if (contains1 == true | contains2 == true) {
//            if ((contains9 == true | contains10 == true) & (contains3 == true | contains4 == true | contains5 == true)) {
//                System.out.println("===垃圾钟种类：包含力的东皇钟===");
//                robot.delay(2000);
//                System.out.println("继续转化……");
//                //1.点击转化  328 450
//                RobotUtils.moseLeft(x + 328, y + 450, 500);
//                //2.确定按钮
//                RobotUtils.moseLeft(x + 349, y + 351, 500);
//                CharIf01.setTemp(getNum3());
//            } else {
//                robot.delay(2000);
//                System.out.println("+++幸运钟类型：乾坤袋幸运钟+++");
//                //右键操作  坐标为乾坤袋坐标
//                RobotUtils.MouseRight(x + 236, y + 266, 500);
//            }
//        } else {
//            System.out.println("===垃圾钟种类：普通类别===");
//            robot.delay(2000);
//            //1.点击转化  328 450
//            RobotUtils.moseLeft(x + 328, y + 450, 500);
//            RobotUtils.moseLeft(x + 328, y + 450, 500);
//            //2.确定按钮
//            RobotUtils.moseLeft(x + 349, y + 351, 500);
//            CharIf01.setTemp(getNum3());
//        }

    }

    public static int getIi() {
        return ii;
    }

    public static int setIi(int ii) {
        CharIf01.ii = ii;
        return ii;
    }

    public static int getTemp() {
        return temp;
    }

    public static void setTemp(int temp) {
        CharIf01.temp = temp;
    }

    public static int getNum1() {
        return num1;
    }

    public static void setNum1(int num1) {
        CharIf01.num1 = num1;
    }

    public static int getNum2() {
        return num2;
    }

    public static void setNum2(int num2) {
        CharIf01.num2 = num2;
    }

    public static int getNum3() {
        return num3;
    }

    public static void setNum3(int num3) {
        CharIf01.num3 = num3;
    }

    public static int getNum4() {
        return num4;
    }

    public static void setNum4(int num4) {
        CharIf01.num4 = num4;
    }
}
