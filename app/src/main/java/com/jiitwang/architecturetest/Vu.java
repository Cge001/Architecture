package com.jiitwang.architecturetest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jiitwang on 2016/11/18.
 */

public interface Vu {

    void infalte(LayoutInflater inflater, ViewGroup container, Bundle bundle);
    View getView();
}
