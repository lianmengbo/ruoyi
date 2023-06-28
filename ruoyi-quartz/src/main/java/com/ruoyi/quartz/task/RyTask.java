package com.ruoyi.quartz.task;

import com.ruoyi.framework.websocket.WebSocketServer;
import com.ruoyi.framework.websocket.WebSocketUsers;
import org.springframework.stereotype.Component;
import com.ruoyi.common.utils.StringUtils;

import javax.annotation.Resource;
import javax.websocket.Session;

/**
 * 定时任务调度测试
 * 
 * @author ruoyi
 */
@Component("ryTask")
public class RyTask
{
    @Resource
    private WebSocketServer webSocketServer;
    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i)
    {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

    public void ryParams(String params)
    {
        System.out.println("执行有参方法：" + params);
    }

    public void ryNoParams()
    {

    }
}
