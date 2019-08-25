package com.jyl.game.JyTemp.utils.screen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @Auther: pc
 * @Date: 2019-08-05 21:01
 * @Description: 截图工具类
 */
public class ScreenUtils {

    public static void main(String[] args) {
        String path = "C:\\Users\\pc\\Desktop\\jpg\\家园种植个数.jpg";
        screenUtils(path,802,413);
    }

    public  static void  screenUtils(String path,int x,int y){
        long st = System.currentTimeMillis();
        try {
            Robot robot = new Robot();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Rectangle rectangle = new Rectangle(screenSize);
            BufferedImage image = robot.createScreenCapture(rectangle);
            BufferedImage subimage = image.getSubimage(x+388, y+22, 30, 20);
            Thread.sleep(500);
            ImageIO.write(subimage,"jpg",new File(String.valueOf(path)));
            long sp = System.currentTimeMillis();
            System.out.println("截图耗时："+(sp-st)+"毫秒");
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
