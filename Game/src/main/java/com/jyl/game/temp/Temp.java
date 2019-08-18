package com.jyl.game.temp;

import com.jyl.game.web.pojo.enumCode.EnumCode;
import com.jyl.game.web.pojo.enumCode.EnumCodeJn;
import com.jyl.game.web.utils.chectIf.CharIf01;
import com.jyl.game.web.utils.json.CharExtForJson;
import com.jyl.game.web.utils.robot.RobotUtils;
import com.jyl.game.web.utils.screen.Screen_Ext_Utils;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: pc
 * @Date: 2019-08-18 19:34
 * @Description:
 */
public class Temp {
    public static void main(String[] args) {

    }
    public static void temp(String path,int x,int y,String ck){
        Robot robot = new Robot();

        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String start = dateFormat.format(now);
        System.out.println("开始时间为：" + start);
        while (true) {

            int length = EnumCode.values().length;
            int len = length;
            System.out.println(length);

            //遍历背包
            for (EnumCode i : EnumCode.values()) {

                int ordinal = i.ordinal();
                System.out.println(ordinal);
                for (int a = ordinal; a <= len; a++) {
//                    鼠标位置
                    int mouseX = i.getX();
                    int mouseY = i.getY();
                    //背包截图坐标
                    int screenX = i.getSrceenX();
                    int screenY = i.getSrceenY();
                    //乾坤袋截图坐标
                    int qkdX = i.getQkdX();
                    int qkdY = i.getQkdY();
                    RobotUtils.moseRun(x + mouseX, y + mouseY, 500);
                    System.out.println("检测背包");

                    //截图--背包截图文字处理
                    System.out.println("截图处理");
                    Screen_Ext_Utils.screen_Ext_Utils(path, x + screenX, y + screenY);
                    System.out.println("背包识别为:" + CharExtForJson.getParam());
                    //是否有钟
                    int temp1 = CharExtForJson.getTemp();
                    if (temp1 == 1) {
                        System.out.println("没有钟……跳过此格子");
                        CharExtForJson.setTemp(0);
                        break;
                    }
                    System.out.println("发现钟");
                    //识别垃圾钟
                    CharIf01.charExtForIf(CharExtForJson.getParam(), x, y);
                    //是否为垃圾钟
                    int temp2 = CharIf01.getTemp();
                    if (temp2 == 1) {
                        System.out.println("为幸运钟……跳过");
                        CharIf01.setTemp(0);
                        break;
                    }
                    RobotUtils.MouseRight(x + mouseX, y + mouseY, 1000);
                    //1.点击转化  328 450
                    RobotUtils.moseLeft(x + 328, y + 450, 500);
                    //2.确定按钮
                    RobotUtils.moseLeft(x + 349, y + 351, 500);

                    System.out.println("检测乾坤袋");
                    //截图--乾坤袋截图文字处理
                    Screen_Ext_Utils.screen_Ext_Utils2(path, x + qkdX, y + qkdY);
                    System.out.println("背包识别为:" + CharExtForJson.getParam());
                    //是否有钟
                    int temp3 = CharExtForJson.getTemp();
                    if (temp3 == 1) {
                        System.out.println("没有钟……跳过此格子");
                        CharExtForJson.setTemp(0);
                        break;
                    }
                    System.out.println("发现钟");
                    //识别垃圾钟
                    CharIf01.charExtForIf2(CharExtForJson.getParam(), x, y);
                    //是否需要循环转化乾坤袋的垃圾钟
                    int temp4 = CharIf01.getTemp();
                    if (temp4 == 2) {
                        CharIf01.setTemp(0);
                        while (true) {
                            //截图识别
                            Screen_Ext_Utils.screen_Ext_Utils3(path, x + qkdX, y + qkdY);
                            int temp5 = CharExtForJson.getTemp();
                            if (temp5 == 1) {
                                System.out.println("乾坤袋转化失败，重新放入钟");
                                CharExtForJson.setTemp(0);
                                break;
                            } else {
                                System.out.println("乾坤袋没有转化失败，判断垃圾钟");
                                System.out.println("乾坤袋得到的钟为：" + CharExtForJson.getParam());
                                Screen_Ext_Utils.screen_Ext_Utils3(path, x + qkdX, y + qkdY);
                                CharIf01.charExtForIf3(CharExtForJson.getParam(), x, y);
                                int temp6 = CharIf01.getTemp();
                                if (temp6 == 3) {
                                    CharIf01.setTemp(0);
                                    //继续转化
                                    robot.delay(1000);
                                    //1.点击转化  328 450
                                    RobotUtils.moseLeft(x + 328, y + 450, 500);
                                    RobotUtils.moseLeft(x + 328, y + 450, 500);
                                    //2.确定按钮
                                    RobotUtils.moseLeft(x + 349, y + 351, 500);
                                } else {
                                    System.out.println("+++幸运钟+++");
                                    //右键操作  坐标为乾坤袋坐标
                                    RobotUtils.MouseRight(x + 236, y + 266, 500);
                                }

                            }
                        }
                    } else {
                        System.out.println("+++幸运钟+++");
                        //右键操作  坐标为乾坤袋坐标
                        RobotUtils.MouseRight(x + 236, y + 266, 500);
                    }


                    robot.delay(1000);
                    if (a == len) {
                        return null;
                    }
                }
            }
            System.out.println("包裹1检测完毕，开始锦囊1");
            RobotUtils.moseLeft(x + 518, y + 132, 500);
//            return;
            if (length == 1) {
                //执行第6排
                int length_JN = EnumCodeJn.values().length;
                int len_JN = length_JN;
                System.out.println(length);

                //遍历背包
                for (EnumCodeJn i : EnumCodeJn.values()) {

                    int ordinal = i.ordinal();
                    System.out.println(ordinal);
                    for (int a = ordinal; a <= len_JN; a++) {
//                    鼠标位置
                        int mouseX = i.getX();
                        int mouseY = i.getY();
                        //背包截图坐标
                        int screenX = i.getSrceenX();
                        int screenY = i.getSrceenY();
                        //乾坤袋截图坐标
                        int qkdX = i.getQkdX();
                        int qkdY = i.getQkdY();
                        RobotUtils.moseRun(x + mouseX, y + mouseY, 500);
                        System.out.println("检测背包");

                        //截图--背包截图文字处理
                        System.out.println("截图处理");
                        Screen_Ext_Utils.screen_Ext_Utils(path, x + screenX, y + screenY);
                        System.out.println("背包识别为:" + CharExtForJson.getParam());
                        //是否有钟
                        int temp7 = CharExtForJson.getTemp();
                        if (temp7 == 1) {
                            System.out.println("没有钟……跳过此格子");
                            CharExtForJson.setTemp(0);
                            break;
                        }
                        System.out.println("发现钟");
                        //识别垃圾钟
                        CharIf01.charExtForIf(CharExtForJson.getParam(), x, y);
                        //是否为垃圾钟
                        int temp8 = CharIf01.getTemp();
                        if (temp8 == 1) {
                            System.out.println("为幸运钟……跳过");
                            CharIf01.setTemp(0);
                            break;
                        }
                        RobotUtils.MouseRight(x + mouseX, y + mouseY, 1000);
                        //1.点击转化  328 450
                        RobotUtils.moseLeft(x + 328, y + 450, 500);
                        //2.确定按钮
                        RobotUtils.moseLeft(x + 349, y + 351, 500);

                        System.out.println("检测乾坤袋");
                        //截图--乾坤袋截图文字处理
                        Screen_Ext_Utils.screen_Ext_Utils2(path, x + qkdX, y + qkdY);
                        System.out.println("背包识别为:" + CharExtForJson.getParam());
                        //是否有钟
                        int temp9 = CharExtForJson.getTemp();
                        if (temp9 == 1) {
                            System.out.println("没有钟……跳过此格子");
                            CharExtForJson.setTemp(0);
                            break;
                        }
                        System.out.println("发现钟");
                        //识别垃圾钟
                        CharIf01.charExtForIf2(CharExtForJson.getParam(), x, y);
                        //是否需要循环转化乾坤袋的垃圾钟
                        int temp10 = CharIf01.getTemp();
                        if (temp10 == 2) {
                            CharIf01.setTemp(0);
                            while (true) {
                                //截图识别
                                Screen_Ext_Utils.screen_Ext_Utils3(path, x + qkdX, y + qkdY);
                                int temp12 = CharExtForJson.getTemp();
                                if (temp12 == 1) {
                                    CharExtForJson.setTemp(0);
                                    System.out.println("乾坤袋转化失败，重新放入钟");
                                    break;
                                } else {
                                    System.out.println("乾坤袋没有转化失败，判断垃圾钟");
                                    System.out.println("乾坤袋得到的钟为：" + CharExtForJson.getParam());
                                    Screen_Ext_Utils.screen_Ext_Utils3(path, x + qkdX, y + qkdY);
                                    CharIf01.charExtForIf3(CharExtForJson.getParam(), x, y);
                                    int temp11 = CharIf01.getTemp();
                                    if (temp11 == 3) {
                                        CharIf01.setTemp(0);
                                        System.out.println("继续转化");
                                        //继续转化
                                        robot.delay(1000);
                                        //1.点击转化  328 450
                                        RobotUtils.moseLeft(x + 328, y + 450, 500);
                                        RobotUtils.moseLeft(x + 328, y + 450, 500);
                                        //2.确定按钮
                                        RobotUtils.moseLeft(x + 349, y + 351, 500);
                                    } else {
                                        System.out.println("+++幸运钟+++");
                                        //右键操作  坐标为乾坤袋坐标
                                        RobotUtils.MouseRight(x + 236, y + 266, 500);
                                    }

                                }
                            }
                        } else {
                            System.out.println("+++幸运钟+++");
                            //右键操作  坐标为乾坤袋坐标
                            RobotUtils.MouseRight(x + 236, y + 266, 500);
                        }


                        robot.delay(1000);
                        if (a == len_JN) {
                            return null;
                        }
                    }
                }
                System.out.println("背包结束");
                //是否使用仓库
                if (ck == "使用") {
                    System.out.println("检测仓库");

                }

                //结束时间为：
                Date now1 = new Date();
                SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                String stop = dateFormat1.format(now1);
                System.out.println("结束时间为：" + stop);
                return null;
            }
        }

    }
}
