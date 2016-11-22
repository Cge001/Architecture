package com.example.buildermode;

import java.util.ArrayList;

/**
 * Created by jiitwang on 2016/11/21.
 */

public class BenzCarModel extends CarModel {

    public BenzCarModel() {

    }

    public BenzCarModel(ArrayList<String> mSeqence){
        super(mSeqence);
    }

    @Override
    public void start() {
        System.out.println("Benz start.");
    }

    @Override
    public void laBa() {
        System.out.println("Benz laBa.");
    }

    @Override
    public void enginBoom() {
        System.out.println("Benz enginBoom.");
    }

    @Override
    public void stop() {
        System.out.println("Benz stop.");
    }
}
