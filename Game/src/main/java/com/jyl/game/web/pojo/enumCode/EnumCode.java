package com.jyl.game.web.pojo.enumCode;

/**
 * @Auther: pc
 * @Date: 2019-08-17 03:39
 * @Description:
 */
public enum EnumCode {

    /**
     *  背包坐标参数
     *  1.包裹所在格子
     *  2,3：包裹鼠标坐标
     *  4,5：包裹截图坐标
     *  5,6：乾坤袋截图坐标
     *
     */
    G1_1("1_1",445,166,152,325,264,300),
    G1_2("1_2",480,166,190,325,264,300),
    G1_3("1_3",515,166,228,325,264,300),
    G1_4("1_4",555,166,266,325,264,300),
    G1_5("1_5",595,166,304,325,264,300),
    G1_6("1_6",630,166,342,325,264,300),
    G1_7("1_7",670,166,380,325,264,300),
    G1_8("1_8",710,166,418,325,264,300),

    G2_1("2_1",445,205,152,363,264,300),
    G2_2("2_2",480,205,190,363,264,300),
    G2_3("2_3",515,205,228,363,264,300),
    G2_4("2_4",555,205,266,363,264,300),
    G2_5("2_5",595,205,304,363,264,300),
    G2_6("2_6",630,205,342,363,264,300),
    G2_7("2_7",670,205,380,363,264,300),
    G2_8("2_8",710,205,418,363,264,300),

    G3_1("3_1",445,244,152,400,264,300),
    G3_2("3_2",480,244,190,400,264,300),
    G3_3("3_3",515,244,228,400,264,300),
    G3_4("3_4",555,244,266,400,264,300),
    G3_5("3_5",595,244,304,400,264,300),
    G3_6("3_6",630,244,342,400,264,300),
    G3_7("3_7",670,244,380,400,264,300),
    G3_8("3_8",710,244,418,400,264,300),
//
    G4_1("4_1",445,283,152,433,264,300),
    G4_2("4_2",480,283,190,433,264,300),
    G4_3("4_3",515,283,228,433,264,300),
    G4_4("4_4",555,283,266,433,264,300),
    G4_5("4_5",595,283,304,433,264,300),
    G4_6("4_6",630,283,342,433,264,300),
    G4_7("4_7",670,283,380,433,264,300),
    G4_8("4_8",710,283,418,433,264,300),

    G5_1("5_1",445,322,152,453,264,300),
    G5_2("5_2",480,322,190,453,264,300),
    G5_3("5_3",515,322,228,453,264,300),
    G5_4("5_4",555,322,266,453,264,300),
    G5_5("5_5",595,322,304,453,264,300),
    G5_6("5_6",630,322,342,453,264,300),
    G5_7("5_7",670,322,380,453,264,300),
    G5_8("5_8",710,322,418,453,264,300),

//    //包裹
//    bg("包裹",455,134,0,0,0,0),
//    //锦囊1
//    jn1("锦囊1",518,132,0,0,0,0),
//    //整理坐标
//    zl("整理",707,422,0,0,0,0),

    //锦囊坐标

    ;

    String code;
    int x;
    int y;

    int srceenX;
    int srceenY;

    int qkdX;
    int qkdY;

    EnumCode(String code, int x, int y, int srceenX, int srceenY, int qkdX, int qkdY) {
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
