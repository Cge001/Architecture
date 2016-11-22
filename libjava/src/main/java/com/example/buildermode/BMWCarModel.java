package com.example.buildermode;

import java.util.ArrayList;

/**
 * Created by jiitwang on 2016/11/21.
 */

public class BMWCarModel extends CarModel {

    public BMWCarModel(ArrayList<String> sequence) {
        super(sequence);
    }

    @Override
    public void start() {
        System.out.println("BMW start.");
    }

    @Override
    public void laBa() {
        System.out.println("BMW laBa.");
    }

    @Override
    public void enginBoom() {
        System.out.println("BMW enginBoom.");
    }

    @Override
    public void stop() {
        System.out.println("BMW stop.");
    }
}
