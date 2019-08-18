package com.jyl.game.web.websocket;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * @Auther: pc
 * @Date: 2019-08-18 12:50
 * @Description:
 */
@Service
public class MyHandler extends TextWebSocketHandler {
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
            session.sendMessage(new TextMessage("成功建立socket连接"));
    }
}
