package com.example.proxypattern.dynamicproxy;

import com.example.proxypattern.GamePlayer;
import com.example.proxypattern.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by jiitwang on 2016/11/21.
 */

public class ClientDynamic {
    public static void main(String[] args) {
        final IGamePlayer player = new GamePlayer("zhangsan");
//        InvocationHandler handler = new GamePalyerIH(player);
//
//        ClassLoader classLoader = player.getClass().getClassLoader();
//        // create a proxy
//        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, handler);
//        proxy.login("zhangsan", "pwd");
//        proxy.killBoss();
//        proxy.upgrade();


        // create a proxy to proxy the player
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(player.getClass().getClassLoader(),
                player.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        return method.invoke(player, objects);
                    }
                });
        proxy.login("zhangsan", "pwd");
        proxy.killBoss();
        proxy.upgrade();
    }
}
