package com.example.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by jiitwang on 2016/11/21.
 */

public class GamePalyerIH implements InvocationHandler {

    //
    Object obj = null;

    //
    public GamePalyerIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = method.invoke(this.obj, objects);
        return result;
    }
}
