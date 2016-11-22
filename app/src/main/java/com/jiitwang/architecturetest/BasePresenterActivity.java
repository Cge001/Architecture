package com.jiitwang.architecturetest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jiitwang on 2016/11/18.
 */

public abstract class BasePresenterActivity<V extends Vu> extends AppCompatActivity {
    protected V vu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            vu = getVuClass().newInstance();
            vu.infalte(getLayoutInflater(), null, null);
            setContentView(vu.getView());
            onBindVu();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onDestroy() {
        onDestroyVu();
        vu = null;
        super.onDestroy();
    }

    protected abstract Class<V> getVuClass();

    protected void onDestroyVu() {
    }

    protected abstract void onBindVu();
}
