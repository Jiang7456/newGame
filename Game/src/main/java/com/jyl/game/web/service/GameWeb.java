package com.jyl.game.web.service;

import com.jyl.game.web.pojo.param.request.GameRequest;
import com.jyl.game.web.pojo.param.response.GameResponse;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @Auther: pc
 * @Date: 2019-08-18 10:55
 * @Description:
 */
public interface GameWeb {


    /**
     * 主程序
     */
    GameResponse temp(GameRequest request) throws AWTException, IOException, URISyntaxException;

    /**
     * 仓库检测
     */
    GameResponse repo(int key);

    String test(GameRequest request,boolean temp) ;


}
