package com.example.proxypattern;

/**
 * Created by jiitwang on 2016/11/21.
 */

public interface IGamePlayer {

    //
    void login(String user, String password);

    //
    void killBoss();

    //
    void upgrade();

    //
    IGamePlayer getProxy();
}
