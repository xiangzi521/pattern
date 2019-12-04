package com.mxz.BuilderPattern.builder;

import com.mxz.BuilderPattern.BMWModel;
import com.mxz.BuilderPattern.CarModel;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/9/5.
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmw = new BMWModel();
    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }
}
