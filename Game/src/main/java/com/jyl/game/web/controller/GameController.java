package com.jyl.game.web.controller;

import com.jyl.game.web.pojo.enumCode.ErrorCode;
import com.jyl.game.web.pojo.param.request.GameRequest;
import com.jyl.game.web.pojo.param.response.GameResponse;
import com.jyl.game.web.service.GameWeb;
import com.jyl.game.web.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @Auther: pc
 * @Date: 2019-08-18 11:37
 * @Description:
 */
@Controller
public class GameController {

    @Resource
    private GameWeb gameWeb;

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/start")
    public String start() {
        return "start";
    }

    @ResponseBody
    @RequestMapping(value = "/game", method = RequestMethod.POST)
    public Result<GameResponse> game(GameRequest request, HttpServletResponse response) {
        if (request.getPath() == null) {
            return Result.createErrorResponse(ErrorCode.PARAM_NOT_NULL);
        }
        if (request.getX() == null) {
            return Result.createErrorResponse(ErrorCode.PARAM_NOT_NULL);
        }
        if (request.getY() == null) {
            return Result.createErrorResponse(ErrorCode.PARAM_NOT_NULL);
        }
        try {
            gameWeb.temp(request);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.createErrorResponse(ErrorCode.SYSTEMCODE);
        }
        return Result.createResponse(new GameResponse());
    }

    @ResponseBody
    @RequestMapping(value = "/gameStop")
    public Result<GameResponse> gameStop(GameRequest request) {
        return Result.createResponse(new GameResponse());
    }
}
