package com.example.buildermode;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jiitwang on 2016/11/21.
 */

public class ABenzCarBuilder extends CarBuilder {
    private CarModel carModel = null;
    //
    private ArrayList<String> mSequence = null;

    @Override
    protected void setSequence(ArrayList<String> mSequence) {
        this.mSequence = mSequence;
    }

    @Override
    protected CarModel buildCarModel() {
        carModel = new BenzCarModel();
        carModel.setSequence(this.mSequence);
        return carModel;
    }
}
