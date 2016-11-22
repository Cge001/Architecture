package com.example.buildermode;

import java.util.ArrayList;

/**
 * Created by jiitwang on 2016/11/21.
 */

public class Client {

    public static void main(String[] args) {
        ArrayList<String> mSequence = new ArrayList<>();
        mSequence.add("start");
        mSequence.add("enginBoom");
        mSequence.add("laBa");
        mSequence.add("stop");

        CarModel mCarModel = new BenzCarModel(mSequence);
        mCarModel.run();
    }


}
