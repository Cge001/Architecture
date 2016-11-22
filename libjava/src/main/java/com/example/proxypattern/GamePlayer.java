package com.example.proxypattern;

/**
 * Created by jiitwang on 2016/11/21.
 */

public class GamePlayer implements IGamePlayer {

    //
    private String name = "";

    //
    private IGamePlayer proxy = null;

    //
    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if(this.isProxy()) {
            System.out.println("login ok.");
        } else {
            System.out.println("please setting a proxy.");
        }
    }

    @Override
    public void killBoss() {
        if(this.isProxy()) {
            System.out.println("kill a boos.");
        } else {
            System.out.println("please setting a proxy.");
        }
    }

    @Override
    public void upgrade() {
        if(this.isProxy()) {
            System.out.println("upgrade a level.");
        } else {
            System.out.println("please setting a proxy.");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    //
    public boolean isProxy() {
        return this.proxy != null;
    }
}
