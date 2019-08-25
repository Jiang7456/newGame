package com.jyl.game.JyTemp;

import com.jyl.game.JyTemp.utils.check.Check;
import com.jyl.game.JyTemp.utils.food.CheckFood;
import com.jyl.game.JyTemp.utils.json.CharExtForJson;
import com.jyl.game.JyTemp.utils.screen.ScreenUtils;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @Auther: pc
 * @Date: 2019-08-25 12:45
 * @Description:
 */
public class BBFood {
    public static void main(String[] args) throws AWTException, IOException, URISyntaxException {
        String path = "C:\\Users\\pc\\Desktop\\jpg\\家园种植个数.jpg";
        bbFood(path, 802, 413);
    }

    public static void bbFood(String path, int x, int y) throws IOException, URISyntaxException, AWTException {
        //截图
        ScreenUtils.screenUtils(path, x, y);
        String param = Check.checkFile(path);
        String s = CharExtForJson.charExtForJson(param);
        if (s.equals("0")) {
            System.out.println("没有菜，让宝宝种菜");
            CheckFood.checkFood(x, y);
        }
        System.out.println("退出");
    }
}
