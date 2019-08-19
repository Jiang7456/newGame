package com.jyl.game.web.pojo.enumCode;

/**
 * @Auther: pc
 * @Date: 2019-08-19 02:01
 * @Description:
 */
public enum RepoEnum {

    /**
     * 1.98 215
     * 2.127 215
     * 3.162 211
     * 4.193 215
     * 5.227 215
     * 6.259 213
     * 7.293 213
     * 8.327 215
     */
    ck1(1, 98, 215),
    ck2(2, 127, 215),
    ck3(3, 162, 211),
    ck4(4, 193, 215),
    ck5(5, 227, 215),
    ck6(6, 259, 213),
    ck7(7, 293, 213),
    ck8(8, 327, 215),;
    int num;
    int x;
    int y;

     RepoEnum(int num, int x, int y) {
        this.num = num;
        this.x = x;
        this.y = y;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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
}
