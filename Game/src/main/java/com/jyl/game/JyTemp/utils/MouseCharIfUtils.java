package com.jyl.game.JyTemp.utils;

import com.jyl.game.web.utils.robot.RobotUtils;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @Auther: pc
 * @Date: 2019-08-20 01:11
 * @Description: 小精灵搜索船工周行
 */
public class MouseCharIfUtils {


    public static void main(String[] args) throws AWTException {
        mouse(828,376);
    }
    /**
     * 打开精灵输入 cgzx
     */
    public static void mouse(int x, int y) throws AWTException {
        System.out.println("打开精灵");
        //打开精灵
        RobotUtils.moseLeft(x + 760, y + 57, 1000);
        //移动到输入框
        System.out.println("移动到输入框");
        RobotUtils.moseLeft(x + 236, y + 487, 1000);
        //输入cgzx
        System.out.println("cgzx");
        RobotUtils.pcImput(KeyEvent.VK_C, 500);
        RobotUtils.pcImput(KeyEvent.VK_G, 500);
        RobotUtils.pcImput(KeyEvent.VK_Z, 500);
        RobotUtils.pcImput(KeyEvent.VK_X, 500);
        //点击结果
        System.out.println("点击结果");
        RobotUtils.moseLeft(x + 250, y + 515, 1000);
        //点击发送
        System.out.println("点击发送");
        RobotUtils.moseLeft(x + 569, y + 492, 1000);
        //点击查询坐标
        System.out.println("点击查询坐标");
        RobotUtils.moseLeft(x + 299, y + 231, 1000);
    }

    /**
     * 回到起始点
     */
    public static void mouse1(int x, int y) throws AWTException {
        Robot r = new Robot();
        //打开精灵
        System.out.println("回到起始点");
        System.out.println("打开精灵");
        RobotUtils.moseLeft(x + 760, y + 57, 1000);
        //移动到输入框
        System.out.println("移动到输入框");
        RobotUtils.moseLeft(x + 236, y + 487, 1000);
        //输入cgzx
        System.out.println("输入cgzx");
        RobotUtils.pcImput(KeyEvent.VK_C, 500);
        RobotUtils.pcImput(KeyEvent.VK_G, 500);
        RobotUtils.pcImput(KeyEvent.VK_Z, 500);
        RobotUtils.pcImput(KeyEvent.VK_X, 500);
        //点击结果
        System.out.println("点击结果");
        RobotUtils.moseLeft(x + 250, y + 515, 1000);
        //点击发送
        System.out.println("点击发送");
        RobotUtils.moseLeft(x + 569, y + 492, 1000);
        //点击查询坐标
        System.out.println("点击查询坐标");
        RobotUtils.moseLeft(x + 299, y + 231, 1000);
        r.delay(35000);
        //关闭所有窗口
        System.out.println("关闭所有窗口");
        RobotUtils.MouseRight(x+579,y+108,500);
        RobotUtils.MouseRight(x+579,y+108,500);
        r.delay(2000);
    }


    /**
     *  输入种植点坐标 苗圃一
     */
    public static void load1(int x,int y) throws AWTException {
        //打开大地图
        System.out.println("打开大地图");
        RobotUtils.moseLeft(x + 665, y + 152, 1000);
        //输入寻路坐标1
        System.out.println("输入寻路坐标1");
        RobotUtils.moseLeft(x + 130 , y + 67, 1000);
        //清除老坐标
        System.out.println("清除老坐标");
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);

        //删除
        System.out.println("删除");
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);

        //输入 137
        System.out.println("输入 137");
        RobotUtils.pcImput(KeyEvent.VK_1,200);
        RobotUtils.pcImput(KeyEvent.VK_3,200);
        RobotUtils.pcImput(KeyEvent.VK_7,200);

        //输入寻路坐标2
        System.out.println("输入寻路坐标2");
        RobotUtils.moseLeft(x + 164  , y + 67, 1000);

        //清除老坐标
        System.out.println("清除老坐标");
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);

        //删除
        System.out.println("删除");
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);

        //输入 64
        System.out.println("输入 64");
        RobotUtils.pcImput(KeyEvent.VK_6,200);
        RobotUtils.pcImput(KeyEvent.VK_4,200);

        //点击寻路
        System.out.println("点击寻路");
        RobotUtils.moseLeft(x + 221 , y + 70, 3000);
        //关闭大地图
        System.out.println("关闭大地图");
        RobotUtils.moseLeft(x + 791, y + 34, 1000);

    }

    /**
     *  输入种植点坐标 苗圃二
     */
    public static void load2(int x,int y) throws AWTException {
        //打开大地图
        System.out.println("打开大地图");
        RobotUtils.moseLeft(x + 665, y + 152, 1000);
        //输入寻路坐标1
        System.out.println("输入寻路坐标1");
        RobotUtils.moseLeft(x + 130 , y + 67, 1000);
        //清楚老坐标
        System.out.println("清楚老坐标");
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);

        //删除
        System.out.println("删除");
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);

        //输入 137
        System.out.println("输入 137");
        RobotUtils.pcImput(KeyEvent.VK_1,200);
        RobotUtils.pcImput(KeyEvent.VK_5,200);
        RobotUtils.pcImput(KeyEvent.VK_0,200);

        //输入寻路坐标2
        System.out.println("输入寻路坐标2");
        RobotUtils.moseLeft(x + 164  , y + 67, 1000);

        //清楚老坐标
        System.out.println("清楚老坐标");
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);

        //删除
        System.out.println("删除");
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);

        //输入 64
        System.out.println("输入 64");
        RobotUtils.pcImput(KeyEvent.VK_6,200);
        RobotUtils.pcImput(KeyEvent.VK_5,200);

        //点击寻路
        System.out.println("点击寻路");
        RobotUtils.moseLeft(x + 221 , y + 70, 3000);
        //关闭大地图
        System.out.println("关闭大地图");
        RobotUtils.moseLeft(x + 791, y + 34, 1000);
    }

    /**
     * 收取苗圃二
     */
    public static void load3(int x,int y) throws AWTException {
        //打开大地图
        System.out.println("打开大地图");
        RobotUtils.moseLeft(x + 665, y + 152, 1000);
        //输入寻路坐标1
        System.out.println("输入寻路坐标1");
        RobotUtils.moseLeft(x + 130 , y + 67, 1000);
        //清除老坐标
        System.out.println("清除老坐标");
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);

        //删除
        System.out.println("删除");
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);

        //输入 137
        System.out.println("输入 137");
        RobotUtils.pcImput(KeyEvent.VK_1,200);
        RobotUtils.pcImput(KeyEvent.VK_4,200);
        RobotUtils.pcImput(KeyEvent.VK_2,200);

        //输入寻路坐标2
        System.out.println("输入寻路坐标2");
        RobotUtils.moseLeft(x + 164  , y + 67, 1000);

        //清除老坐标
        System.out.println("清除老坐标");
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);
        RobotUtils.pcImput(KeyEvent.VK_RIGHT,200);

        //删除
        System.out.println("删除");
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);
        RobotUtils.pcImput(KeyEvent.VK_BACK_SPACE,200);

        //输入 64
        System.out.println("输入 64");
        RobotUtils.pcImput(KeyEvent.VK_6,200);
        RobotUtils.pcImput(KeyEvent.VK_9,200);

        //点击寻路
        System.out.println("点击寻路");
        RobotUtils.moseLeft(x + 221 , y + 70, 3000);
        //关闭大地图
        System.out.println("关闭大地图");
        RobotUtils.moseLeft(x + 791, y + 34, 1000);

    }


}
