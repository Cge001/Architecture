package com.jiitwang.architecturetest;

/**
 * Created by jiitwang on 2016/11/18.
 */


public class HelloActivity extends BasePresenterActivity {

    private static HelloActivity mInstance;

    @Override
    protected Class<HelloVu> getVuClass() {
        return HelloVu.class;
    }

    @Override
    protected void onBindVu() {
    }

    /**
     * @return
     */
    public static HelloActivity newInstance() {
        if(null == mInstance) {
            mInstance = new HelloActivity();
        }

        return mInstance;
    }
}
