package com.jyl.game.web.utils.screen;

import com.jyl.game.web.utils.check.Check;
import com.jyl.game.web.utils.json.CharExtForJson;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @Auther: pc
 * @Date: 2019-08-17 08:51
 * @Description: 背包截图 文字识别
 */
public class Screen_Ext_Utils {


    public static void main(String[] args) throws AWTException, IOException, URISyntaxException {
        String path = "C:\\Users\\pc\\Desktop\\jpg\\";
        int x = 62;
        int y = 127;
        int screenX = x + 264;
        int screenY = y + 300;
        screen_Ext_Utils(path, screenX, screenY);
    }

    public static void screen_Ext_Utils(String path, int screenX, int screenY) throws IOException, URISyntaxException, AWTException {
        Robot robot = new Robot();
        String path1 = path + "背包截图.jpg";
        //背包截图
        ScreenUtils.screenUtils(path1, screenX, screenY);
        //文字识别
        String param = Check.checkFile(path1);
        //文字处理
        CharExtForJson.charExtForJsonFromIf(param);
//        if (CharExtForJson.getTemp() == 1) {
//            //防止转化卡主，重新截图判断
//            System.out.println("防止卡主，重新截图");
//            robot.delay(2000);
//            ScreenUtils.screenUtils(path1, screenX, screenY);
//            String param1 = Check.checkFile(path1);
//            CharExtForJson.charExtForJsonFromIf(param1);
//        }

    }

    public static void screen_Ext_Utils2(String path, int screenX, int screenY) throws IOException, URISyntaxException, AWTException {
        Robot robot = new Robot();
        String path1 = path + "乾坤袋截图.jpg";
        //背包截图
        ScreenUtils.screenUtils(path1, screenX, screenY);
        //文字识别
        String param = Check.checkFile(path1);
        //文字处理
        CharExtForJson.charExtForJsonFromIf2(param);
//        if (CharExtForJson.getTemp() == 1) {
//            //防止转化卡主，重新截图判断
//            System.out.println("防止卡主，重新截图");
//            robot.delay(2000);
//            ScreenUtils.screenUtils(path1, screenX, screenY);
//            String param1 = Check.checkFile(path1);
//            CharExtForJson.charExtForJsonFromIf2(param1);
//        }
    }

    public static void screen_Ext_Utils3(String path, int screenX, int screenY) throws IOException, URISyntaxException, AWTException {
        Robot robot = new Robot();
        String path1 = path + "乾坤袋循环转化截图.jpg";
        //背包截图
        ScreenUtils.screenUtils(path1, screenX, screenY);
        //文字识别
        String param = Check.checkFile(path1);
        //文字处理
        CharExtForJson.charExtForJsonFromIf2(param);
//        if (CharExtForJson.getTemp() == 1) {
//            //防止转化卡主，重新截图判断
//            System.out.println("防止卡主，重新截图");
//            robot.delay(2000);
//            ScreenUtils.screenUtils(path1, screenX, screenY);
//            String param1 = Check.checkFile(path1);
//            CharExtForJson.charExtForJsonFromIf2(param1);
//        }

    }


}
