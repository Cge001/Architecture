package com.jiitwang.architecturetest.mvpweakreference;

import com.jiitwang.architecturetest.HelloActivity;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * Created by jiitwang on 2016/11/18.
 */

public abstract class BasePresenter<T> {

    protected Reference<T> mViewRef;

    public void attachView(T view) {
        mViewRef = new WeakReference<>(view);
    }

    protected T getView() {
        return mViewRef.get();
    }

    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    public void detachView() {
        if(null != mViewRef) {
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
