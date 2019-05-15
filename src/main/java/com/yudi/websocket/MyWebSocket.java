/**
 * Copyright [2016-2017] [yadong.zhang]
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yudi.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 */
@ServerEndpoint(value = "/websocket/{userId}")
@Component
public class MyWebSocket {
    /**
     * concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
     */
   // private static CopyOnWriteArraySet<MyWebSocket> webSocketSet = new CopyOnWriteArraySet<MyWebSocket>();
    /**
     * 为了区分不同的客户端改用ConcurrentHashMap，每次客户端建立一个连接，就会存入一条记录，key为客户端的userId，value为socket连接实例
     * 这样可以通过 userId来调用其指定的连接进行操作。
     */
    private static ConcurrentHashMap<String,MyWebSocket> webSocketMap = new ConcurrentHashMap<String,MyWebSocket>();

    /**
     * 与某个客户端的连接会话，需要通过它来给客户端发送数据
     */
    private Session session;

    /**
     * 群发自定义消息
     */
    public static void sendInfo(String message) {
        webSocketMap.forEach((k,v)->{
            try {
                v.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }
    /**
     * 向指定userId发送消息
     */
    public static void sendInfo(String userId,String message) {
        webSocketMap.forEach((k,v)->{
            try {
                if (k.equals(userId)){
                    v.sendMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }
    /**
     * 连接建立成功调用的方法
     *
     */
    @OnOpen
    public void onOpen(@PathParam("userId")String userId, Session session) {
        System.out.println(userId);
        this.session = session;
        webSocketMap.put(userId,this);
        List list = new ArrayList();
        webSocketMap.forEach((k,v)->list.add(k));
//        addOnlineCount();
        System.out.println("有新连接加入！当前在线人数为" + webSocketMap.size());
        sendInfo("当前共有" + webSocketMap.size() + " 位用户在线,userId是:" +list.toString());

    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(@PathParam("userId")String userId) {
        webSocketMap.remove(userId);
        sendInfo("当前共有" + webSocketMap.size() + " 位用户在线");
        System.out.println("有一连接关闭！当前在线人数为" + webSocketMap.size());
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message
     *         客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("来自客户端的消息:" + message);

        //群发消息
        sendInfo(message);
    }
    /**
     * 发生错误时调用
     */
    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("发生错误");
        error.printStackTrace();
    }

    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }
}
