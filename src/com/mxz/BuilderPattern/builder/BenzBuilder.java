package com.mxz.BuilderPattern.builder;

import com.mxz.BuilderPattern.BenzModel;
import com.mxz.BuilderPattern.CarModel;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/9/5.
 */

public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();
    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

}
