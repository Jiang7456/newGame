package com.jyl.game.web.utils.spilt;

/**
 * @Auther: pc
 * @Date: 2019-08-06 01:42
 * @Description: 字符串翻转
 */
public class SpiltRtoL {


    private static String param1;
    private static String param2;

    private static String param3;
    private static String param4;
    private static String param5;


    /**
     * 字符串翻转
     */
    public static String spiltRtoL(String s) {

        StringBuffer sb = new StringBuffer();
        int length = s.length();
        char[] c = new char[length];
        for (int i = 0; i < length; i++) {
            c[i] = s.charAt(i);
        }
        for (int i = length - 1; i >= 0; i--) {
            sb.append(c[i]);
        }

        return sb.toString();
    }

    /**
     * 截取字符串
     */

    public static void test(String param) {


        String s = param;
        String a = spiltRtoL(s);

        //倒数第一
        String b = a.substring(0, 1);
        //倒数第二
        String d = a.substring(1, 2);
        //正数前三
        String a1 = s.substring(0, 1);
        String a2 = s.substring(1, 2);
        String a3 = s.substring(2, 3);

        String c = spiltRtoL(b);
        String e = spiltRtoL(d);

        SpiltRtoL.setParam1(c);
        SpiltRtoL.setParam2(e);

        SpiltRtoL.setParam3(a1);
        SpiltRtoL.setParam4(a2);
        SpiltRtoL.setParam5(a3);

    }

    public static void main(String[] args) {
        test("东皇钟火落");
        System.out.println(SpiltRtoL.getParam3());
        System.out.println(SpiltRtoL.getParam4());
        System.out.println(SpiltRtoL.getParam5());
    }

    public static String getParam1() {
        return param1;
    }

    public static void setParam1(String param1) {
        SpiltRtoL.param1 = param1;
    }

    public static String getParam2() {
        return param2;
    }

    public static void setParam2(String param2) {
        SpiltRtoL.param2 = param2;
    }

    public static String getParam3() {
        return param3;
    }

    public static void setParam3(String param3) {
        SpiltRtoL.param3 = param3;
    }

    public static String getParam4() {
        return param4;
    }

    public static void setParam4(String param4) {
        SpiltRtoL.param4 = param4;
    }

    public static String getParam5() {
        return param5;
    }

    public static void setParam5(String param5) {
        SpiltRtoL.param5 = param5;
    }
}
