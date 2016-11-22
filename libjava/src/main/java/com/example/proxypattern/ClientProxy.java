package com.example.proxypattern;

/**
 * Created by jiitwang on 2016/11/21.
 */

public class ClientProxy {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("zhangsan");
        gamePlayer.getProxy();

        gamePlayer.login("zhangsan", "pwd");
        gamePlayer.killBoss();
        gamePlayer.upgrade();

//        IGamePlayer player = new GamePlayer("lisi");
//        IGamePlayer playerProxy = new GamePlayerProxy(player);
//        playerProxy.login("lisi", "pwd");
//        playerProxy.killBoss();
//        playerProxy.upgrade();
    }
}
