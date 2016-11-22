package com.example.buildermode;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiitwang on 2016/11/21.
 */

public abstract class CarModel {
    // sequence
    protected ArrayList<String> mSequence = new ArrayList<>();

    public CarModel () {
    }

    // constraction inject
    protected CarModel(ArrayList<String> sequence) {
        this.mSequence = sequence;
    }

    // car Start
    protected abstract void start();

    // car laBa
    public abstract void laBa();

    // car enginBoom
    protected abstract void enginBoom();

    // car Stop
    protected abstract void stop();

    // excute those process
    protected void run() {
        for (int i = 0; i < mSequence.size(); i++) {
            String s = mSequence.get(i);

            if ("start".equals(s)) {
                start();
            } else if ("laBa".equals(s)) {
                laBa();
            } else if ("enginBoom".equals(s)) {
                enginBoom();
            } else {
                stop();
            }
        }
    }

    //
    protected void setSequence(ArrayList<String> sequence) {
        this.mSequence.clear();
        this.mSequence = sequence;
    }
}
