package com.jyl.game.web.utils.repo.repoutils;

import com.jyl.game.web.utils.robot.RobotUtils;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.jyl.game.web.utils.robot.RobotUtils.pcImput;

/**
 * @Auther: pc
 * @Date: 2019-08-18 09:17
 * @Description: 检测仓库
 */
public class RepoUtils {
    public static void main(String[] args) throws AWTException {
        repoImpl(177, 235,500);
    }

    public static void repoImpl(int x, int y,int ms) throws AWTException {
        //自动寻路面板
        RobotUtils.moseLeft(x + 785, y + 153, ms);
        //搜索框
        RobotUtils.moseLeft(x + 288, y + 520, ms);
        //输入胡银台 hyt
        pcImput(KeyEvent.VK_H, ms);
        pcImput(KeyEvent.VK_Y, ms);
        pcImput(KeyEvent.VK_T, ms);
        //点击胡银台寻路
        RobotUtils.moseLeft(x + 307, y + 190, ms);
        //打开仓库
        RobotUtils.moseLeft(x + 273, y + 351, ms);

    }
}
