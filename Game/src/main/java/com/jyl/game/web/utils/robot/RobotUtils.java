package com.jyl.game.web.utils.robot;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * @Auther: pc
 * @Date: 2019/5/27 23:30
 * @Description: 鼠标移动工具类
 * 左键点击工具类
 * 右键点击工具类
 * 移动边框工具类
 */
public class RobotUtils {


    /**
     * 左键移动
     */

    public static void moseRun(int x, int y, int ms) throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.delay(ms);
    }


    /**
     * 鼠标移动+左键点击
     * <p>
     * x:x坐标
     * y:y坐标
     * ms:延迟时间
     */
    public static void moseLeft(int x, int y, int ms) throws AWTException {

        Robot robot = new Robot();
        robot.delay(1000);
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(ms);
    }

    /**
     * 没有延迟的左键单击
     */
    public static void noTimeMoseLeft(int x, int y) throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    /**
     * 右键点击操作
     */

    public static void MouseRight(int x, int y, int ms) throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        robot.delay(ms);


    }


    /**
     * 移动边框(状态属于等待移动)
     * <p>
     * x，y:选择要移动的窗口
     * xx,YY: 选择移动按钮进行移动
     * ms:延迟
     */
    public static void moseMove(int x, int y, int xx, int yy, int ms) throws AWTException {
        Robot robot = new Robot();
//        1.鼠标移动到上边框
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.delay(ms);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        robot.delay(ms);
//      2.点击移动按钮
        robot.mouseMove(xx, yy);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(ms);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    /**
     * 移动边框（开始移动）
     * <p>
     * x:移动的位置
     */
    public static void moseMoveStart(int x, int y, int ms) throws AWTException {
        Robot robot = new Robot();
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(ms);
        robot.mouseMove(x, y);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(ms);
    }

    /**
     * 右键移动到基础坐标
     */
    public static void moseRight(int x, int y, int ms) throws AWTException {
        Robot robot = new Robot();
//        1.鼠标移动到上边框
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.delay(ms);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        robot.delay(ms);
////      2.点击移动按钮
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(ms);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
