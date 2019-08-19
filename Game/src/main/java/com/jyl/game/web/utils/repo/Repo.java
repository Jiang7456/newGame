package com.jyl.game.web.utils.repo;

import com.jyl.game.web.pojo.enumCode.RepoEnum;
import com.jyl.game.web.utils.repo.repoutils.RepoUtils;
import com.jyl.game.web.utils.robot.RobotUtils;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @Auther: pc
 * @Date: 2019-08-19 01:45
 * @Description:
 */
public class Repo {
    public static void main(String[] args) throws AWTException {
        repo(126, 160,"ck3","ck4","ck5","ck6","ck7");
    }

    public static void repo(int x, int y, String ck3, String ck4, String ck5, String ck6, String ck7) throws AWTException {
        //打开仓库
        RepoUtils.repoImpl(x, y, 500);
        //钟所在页数
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
        if (ck3 != null) {
            int x1 = RepoEnum.valueOf(ck3).getX();
            int y1 = RepoEnum.valueOf(ck3).getY();
            RobotUtils.moseLeft(x+x1,y+ y1, 500);
            //仓库包裹互换
            RobotUtils.moseLeft(x+374,y+ 209, 500);
        }
//        if (ck4 != null) {
//            int x1 = RepoEnum.valueOf(ck4).getX();
//            int y1 = RepoEnum.valueOf(ck4).getY();
//            RobotUtils.moseLeft(x+x1,y+ y1, 500);
//        }
//        if (ck5 != null) {
//            int x1 = RepoEnum.valueOf(ck5).getX();
//            int y1 = RepoEnum.valueOf(ck5).getY();
//            RobotUtils.moseLeft(x+x1,y+ y1, 500);
//
//        }
//        if (ck6!= null) {
//            int x1 = RepoEnum.valueOf(ck6).getX();
//            int y1 = RepoEnum.valueOf(ck6).getY();
//            RobotUtils.moseLeft(x+x1,y+ y1, 500);
//        }
//        if (ck7 != null) {
//            int x1 = RepoEnum.valueOf(ck7).getX();
//            int y1 = RepoEnum.valueOf(ck7).getY();
//            RobotUtils.moseLeft(x+x1,y+ y1, 500);
//        }

    }
}
