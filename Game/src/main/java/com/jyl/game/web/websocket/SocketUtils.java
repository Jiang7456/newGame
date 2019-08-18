package com.jyl.game.web.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;


/**
 * @Auther: pc
 * @Date: 2019-08-18 13:00
 * @Description:
 */
public class SocketUtils {


    public static void main(String[] args) throws Exception {
        socket("成功推送");
    }

    public static void socket(String socket) throws Exception {
        MyHandler myHandler = new MyHandler();
        WebSocketSession webSocketSession = null;
        webSocketSession.sendMessage(new TextMessage(socket));
        myHandler.afterConnectionEstablished(webSocketSession);
    }
}
