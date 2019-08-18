package com.jyl.game.web.pojo.param.request;

/**
 * @Auther: pc
 * @Date: 2019-08-18 11:25
 * @Description:
 */
public class GameRequest {

    private String path;
    private Integer x;
    private Integer y;

    private int key;

    private String ck;

    private boolean stop ;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getCk() {
        return ck;
    }

    public void setCk(String ck) {
        this.ck = ck;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
