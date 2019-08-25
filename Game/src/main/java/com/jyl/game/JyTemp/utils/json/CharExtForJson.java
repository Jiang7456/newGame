package com.jyl.game.JyTemp.utils.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jyl.game.web.utils.check.Check;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @Auther: pc
 * @Date: 2019-08-09 22:05
 * @Description:
 */
public class CharExtForJson {

    private static int temp;

    private static String param;

    public static void main(String[] args) throws IOException, URISyntaxException, AWTException {

        String path = "C:\\Users\\pc\\Desktop\\jpg\\乾坤袋循环转化截图.jpg";
        String s = Check.checkFile(path);
        charExtForJsonFromIf(s);
        System.out.println(CharExtForJson.getParam());

    }

    public static String charExtForJson(String param) {
        JSONObject jsonObject = JSONObject.parseObject(param);
        String words_result = jsonObject.getString("words_result");
        JSONArray jsonArray = JSONArray.parseArray(words_result);
        JSONObject jsonObject1 = jsonArray.getJSONObject(0);
        String words = jsonObject1.getString("words");
        String replace = words.replace("/", "");
        String substring = replace.substring(0, 1);
        return substring;
    }
    public static void charExtForJsonFromIf(String param) throws AWTException {
        Robot robot = new Robot();


        JSONObject jsonObject = JSONObject.parseObject(param);
        String words_result = jsonObject.getString("words_result");
        JSONArray jsonArray = JSONArray.parseArray(words_result);
        System.out.println(jsonArray);

        if (jsonArray.size()==0){
            CharExtForJson.setTemp(1);
            int temp = getTemp();
            System.out.println(temp);
            return;
        }

        JSONObject jsonObject1 = jsonArray.getJSONObject(0);
        String words = jsonObject1.getString("words");
        String replace = words.replace("(", "");
        String replace1 = replace.replace(")", "");
        CharExtForJson.setParam(replace1);

//        return replace1;
    }
    public static void charExtForJsonFromIf2(String param) throws AWTException {

        Robot robot = new Robot();

        JSONObject jsonObject = JSONObject.parseObject(param);
        String words_result = jsonObject.getString("words_result");
        JSONArray jsonArray = JSONArray.parseArray(words_result);

        if (jsonArray.size()==0){
            CharExtForJson.setTemp(1);
            int temp = getTemp();
            System.out.println(temp);
            return;
        }

        JSONObject jsonObject1 = jsonArray.getJSONObject(0);
        String words = jsonObject1.getString("words");
        String replace = words.replace("(", "");
        String replace1 = replace.replace(")", "");
        CharExtForJson.setParam(replace1);

//        return replace1;
    }

    public static String getParam() {
        return param;
    }

    public static void setParam(String param) {
        CharExtForJson.param = param;
    }

    public static int getTemp() {
        return temp;
    }

    public static void setTemp(int temp) {
        CharExtForJson.temp = temp;
    }
}
