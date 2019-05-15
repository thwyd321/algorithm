package com.yudi.websocket.controller;
import com.yudi.websocket.MyWebSocket;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("/websocket")
public class WebSocketController {
    /**
     * 给所有人发消息/指定userId发送消息
     * @param message
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/sendMessage", method = RequestMethod.GET)
    public ResponseEntity<?> sendMessage(String userId,String message) {
        if (StringUtils.isEmpty(userId)){
            //向全部人发送消息
            MyWebSocket.sendInfo(message);
        }else {
            //向指定userId发送消息
            MyWebSocket.sendInfo(userId,message);
        }


        return new ResponseEntity(null,HttpStatus.OK);
    }


    /**
     * 登入聊天室
     * @param userId 用户id，每个人唯一，每一个userId会建立一个websocket连接
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/index")
    public String index(String userId, HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("userId",userId);
        return "index";
    }
}
