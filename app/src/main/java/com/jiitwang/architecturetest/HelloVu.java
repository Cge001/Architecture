package com.jiitwang.architecturetest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jiitwang on 2016/11/18.
 */

public class HelloVu implements Vu {

    View view;
    TextView textView;

    @Override
    public void infalte(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        view = inflater.inflate(R.layout.activity_main, container, false);
        textView = (TextView) view.findViewById(R.id.tv);
    }



    @Override
    public View getView() {
        return view;
    }

    public void setHelloMessage(String msg) {
        textView.setText(msg);
    }
}
