package com.jyl.game.JyTemp;

import com.jyl.game.JyTemp.utils.MouseCharIfUtils;
import com.jyl.game.web.utils.robot.RobotUtils;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: pc
 * @Date: 2019-08-20 01:08
 * @Description: 盆栽
 */
public class JyTemp {
    public static void main(String[] args) throws AWTException, IOException, URISyntaxException {
        int x = 749;
        int y = 19;
        Robot robot = new Robot();
        iffor();
    }

    public static void iffor() throws AWTException, IOException, URISyntaxException {
        String path = "C:\\Users\\pc\\Desktop\\jpg\\家园种植个数.jpg";
        Robot robot  = new Robot();
        for (int i = 0; i <= 20; i++) {
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String start = dateFormat.format(now);
            System.out.println("当前是第：" + i + "次" + ";" + "时间为：" + start);

//            //第四个号点击边框
//            RobotUtils.moseLeft(1902, 424, 1000);
//            //bb收菜
//            BBFood.bbFood(path, 802, 413);


            //第一个号点击边框
            RobotUtils.moseLeft(1746, 16, 1000);
            jyTemp(742, 4);

            //第二个号点击边框
            RobotUtils.moseLeft(334, 223, 1000);
            jyTemp(286, 213);

            //第三个号点击边框
            RobotUtils.moseLeft(171, 337, 1000);
            jyTemp(120, 326);
            for (int j=1;j<=21;j++){
                robot.delay(60000);
            }
//            jyTemp(286, 211);
            //第五个号点击边框
//            RobotUtils.moseLeft(228, 337, 1000);
//            jyTemp(122, 325);
        }


    }

    public static void jyTemp(int x, int y) throws AWTException {

        Robot robot = new Robot();
        //进入家园
        System.out.println("打开周行");
        MouseCharIfUtils.mouse(x, y);
        //点击进入家园
        System.out.println("进入家园");
        RobotUtils.moseLeft(x + 273, y + 374, 15000);

        //关闭精灵
        System.out.println("关闭精灵");
        RobotUtils.moseLeft(x + 760, y + 57, 1000);

        /**
         *  点击大地图寻路到苗圃一
         */
        System.out.println("寻路到苗圃一");
        //打开大地图
        System.out.println("打开大地图");
        RobotUtils.moseLeft(x + 665, y + 152, 1000);
        //寻路苗圃一
        System.out.println("寻路苗圃一");
        RobotUtils.moseLeft(x + 355, y + 386, 20000);
        //关闭大地图
        System.out.println("关闭大地图");
        RobotUtils.moseLeft(x + 791, y + 34, 1000);
        //收取苗圃一
        System.out.println("收取苗圃一");
        RobotUtils.MouseRight(x + 387, y + 479, 500);

        /**
         * 寻路苗圃二
         */
        System.out.println("寻路苗圃二");
        MouseCharIfUtils.load3(x, y);
        //收取苗圃二
        System.out.println("收取苗圃二");
        RobotUtils.MouseRight(x + 387, y + 479, 500);

        /**
         *  回到种植点一；
         *  从收取苗圃二坐标站位寻路
         */
        MouseCharIfUtils.load1(x, y);
        /**
         * 苗圃一
         */
        //打开苗圃1面板
        System.out.println("打开苗圃1面板");
        RobotUtils.moseLeft(x + 236, y + 231, 1000);
        //点击种植
        System.out.println("点击种植");
        RobotUtils.moseLeft(x + 266, y + 351, 500);

        //点击种植作物类型 类型一 树木
        System.out.println("点击种植作物类型");
        RobotUtils.moseLeft(x + 246, y + 136, 500);
        //点击种植作物类型 类型一 花卉
//        RobotUtils.moseLeft(x + 321, y + 137, 500);
        //点击种植作物类型 类型一 蔬果
//        RobotUtils.moseLeft(x + 394, y + 136, 500);


        //点击种植物品 15分钟
        System.out.println("点击种植物品");
//        RobotUtils.moseLeft(x + 234, y + 175, 500);
        //35 分钟
        RobotUtils.moseLeft(x + 233, y + 198, 500);
        //点击栽种
        System.out.println("点击栽种");
        RobotUtils.moseLeft(x + 410, y + 528, 500);

        /**
         * 苗圃二
         * 苗圃二种植点从点击完苗圃一面板开始计算
         */
        //苗圃二种植点
        System.out.println("回到苗圃二种植点");
        MouseCharIfUtils.load2(x, y);
        robot.delay(5000);
        //打开苗圃2面板
        System.out.println("打开苗圃2面板");
        RobotUtils.moseLeft(x + 285, y + 248, 1000);
        //点击种植
        System.out.println("点击种植");
        RobotUtils.moseLeft(x + 266, y + 351, 500);

        //点击种植作物类型 类型一 树木
        System.out.println("点击种植作物类型");
        RobotUtils.moseLeft(x + 246, y + 136, 500);
        //点击种植作物类型 类型一 花卉
//        RobotUtils.moseLeft(x + 321, y + 137, 500);
        //点击种植作物类型 类型一 蔬果
//        RobotUtils.moseLeft(x + 394, y + 136, 500);

        //点击种植物品 15分钟
        System.out.println("点击种植物品");
//        RobotUtils.moseLeft(x + 234, y + 175, 500);
        //35 分钟
        RobotUtils.moseLeft(x + 233, y + 198, 500);

        //点击栽种
        System.out.println("点击栽种");
        RobotUtils.moseLeft(x + 410, y + 528, 500);

        /**
         * 种植完回到船工周行
         */
        System.out.println("种植完回到船工周行");
        MouseCharIfUtils.mouse1(x, y);

    }

}
