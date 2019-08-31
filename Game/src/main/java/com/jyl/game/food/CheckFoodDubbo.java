package com.jyl.game.food;

import com.jyl.game.web.utils.robot.RobotUtils;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: pc
 * @Date: 2019-08-24 13:09
 * @Description: BB 种菜
 */
public class CheckFoodDubbo {


    public static void main(String[] args) throws AWTException {

        Robot robot = new Robot();
        for (int i = 1; i <= 99; i++) {
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String start = dateFormat.format(now);
            System.out.println("这是第" + i + "次" + "时间为：" + start);
            //第一个号
            //点击边框
            RobotUtils.moseLeft(1894, 246, 500);
            checkFood(835, 234);

            //第二个号
            //点击边框
            RobotUtils.moseLeft(389, 192, 500);
            checkFood(340, 180);

            //延迟35分钟
            System.out.println("延迟35分钟");
            for (int j = 1; j <= 35; j++) {
                robot.delay(200);
                robot.delay(60000);
            }
            Date now1 = new Date();
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String start1 = dateFormat1.format(now1);
            System.out.println("结束时间为：" + start1);
        }
    }


    public static void checkFood(int x, int y) throws AWTException {

        //选取角色边框
//            RobotUtils.moseLeft(x + 1098, y + 11, 500);
        //打开BB面板
        RobotUtils.moseLeft(x + 460, y + 40, 500);
        //打开种菜面板
        RobotUtils.moseLeft(x + 452, y + 470, 500);

        /**
         * 苗圃一
         */
        //种菜类型下拉按钮
        RobotUtils.moseLeft(x + 334, y + 260, 500);
        //选取类型 一 15分钟
        RobotUtils.moseLeft(x + 281, y + 285, 500);
        //选取物品 种类下拉按钮
        RobotUtils.moseLeft(x + 602, y + 263, 500);
        //选取物品种类 一 15分钟
//        RobotUtils.moseLeft(x+428,y+284,500);
        //选取物品种类 二 35分钟
        RobotUtils.moseLeft(x + 428, y + 301, 500);

        /**
         * 苗圃二
         */
        //种菜类型下拉按钮
        RobotUtils.moseLeft(x + 335, y + 299, 500);
        //选取类型 二 15分钟
        RobotUtils.moseLeft(x + 278, y + 338, 500);
        //选取物品 种类下拉按钮
        RobotUtils.moseLeft(x + 600, y + 296, 500);
        //选取物品种类 二 15分钟
//        RobotUtils.moseLeft(x+432,y+318,500);
        //选取物品种类 二 35分钟
        RobotUtils.moseLeft(x + 433, y + 336, 500);

        /**
         * 苗圃三
         */
        //种菜类型下拉按钮
        RobotUtils.moseLeft(x + 333, y + 332, 500);
        //选取类型 一 15分钟
        RobotUtils.moseLeft(x + 278, y + 389, 500);
        //选取物品 种类下拉按钮
        RobotUtils.moseLeft(x + 599, y + 329, 500);
        //选取物品种类 一 15分钟
//        RobotUtils.moseLeft(x+430,y+348,500);
        //选取物品种类 二 35分钟
        RobotUtils.moseLeft(x + 426, y + 372, 500);


        /**
         * 苗圃四
         */
        //种菜类型下拉按钮
        RobotUtils.moseLeft(x+333,y+361,500);
        //选取类型 一（蔬果）
//        RobotUtils.moseLeft(x+274,y+382,500);
        //选取类型 二（花卉）
        RobotUtils.moseLeft(x+282,y+422,500);
        //选取物品 种类下拉按钮
        RobotUtils.moseLeft(x+601,y+362,500);
        //选取物品种类 一 15分钟
//        RobotUtils.moseLeft(x+428,y+386,500);
        //选取物品种类 二 35分钟
        RobotUtils.moseLeft(x+431,y+402,500);
        /**
         * 确定
         */
        RobotUtils.moseLeft(x + 343, y + 463, 500);

    }

}
