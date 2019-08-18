package com.jyl.game.web.pojo.enumCode;

/**
 * @Auther: pc
 * @Date: 2019-08-18 00:01
 * @Description: 锦囊第六排坐标
 */
public enum EnumCodeJn {

    /**
     * 背包坐标参数
     * 1.包裹所在格子
     * 2,3：包裹鼠标坐标
     * 4,5：包裹截图坐标
     * 5,6：乾坤袋截图坐标
     */
    jn6_1("锦囊1", 445, 361, 155, 169, 264, 300),
    jn6_2("锦囊2", 480, 361, 193, 169, 264, 300),
    jn6_3("锦囊3", 515, 361, 231, 169, 264, 300),
    jn6_4("锦囊4", 555, 361, 269, 169, 264, 300),
    jn6_5("锦囊5", 595, 361, 307, 169, 264, 300),
    jn6_6("锦囊6", 630, 361, 345, 169, 264, 300),
    jn6_7("锦囊7", 670, 361, 383, 169, 264, 300),
    jn6_8("锦囊8", 710, 361, 421, 169, 264, 300),;

    String code;
    int x;
    int y;

    int srceenX;
    int srceenY;

    int qkdX;
    int qkdY;

    EnumCodeJn(String code, int x, int y, int srceenX, int srceenY, int qkdX, int qkdY) {
        this.code = code;
        this.x = x;
        this.y = y;
        this.srceenX = srceenX;
        this.srceenY = srceenY;
        this.qkdX = qkdX;
        this.qkdY = qkdY;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSrceenX() {
        return srceenX;
    }

    public void setSrceenX(int srceenX) {
        this.srceenX = srceenX;
    }

    public int getSrceenY() {
        return srceenY;
    }

    public void setSrceenY(int srceenY) {
        this.srceenY = srceenY;
    }

    public int getQkdX() {
        return qkdX;
    }

    public void setQkdX(int qkdX) {
        this.qkdX = qkdX;
    }

    public int getQkdY() {
        return qkdY;
    }

    public void setQkdY(int qkdY) {
        this.qkdY = qkdY;
    }

}
