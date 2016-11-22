package com.example.buildermode;

import java.util.ArrayList;

/**
 * Created by jiitwang on 2016/11/21.
 */

public class BBenzCarBuilder extends CarBuilder {
    //
    private ArrayList<String> mSequence = null;
    //
    private CarModel mCarModel = null;


    @Override
    protected void setSequence(ArrayList<String> mSequence) {
        this.mSequence = mSequence;
    }

    @Override
    protected CarModel buildCarModel() {
        mCarModel = new BenzCarModel();
        mCarModel.setSequence(this.mSequence);
        return mCarModel;
    }
}
