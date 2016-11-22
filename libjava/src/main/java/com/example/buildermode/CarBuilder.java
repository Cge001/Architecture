package com.example.buildermode;

import java.util.ArrayList;

/**
 * Created by jiitwang on 2016/11/21.
 */

public abstract class CarBuilder {

    //
    protected abstract void setSequence(ArrayList<String> mSequence);

    //
    protected abstract CarModel buildCarModel();
}
