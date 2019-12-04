package com.mxz.BuilderPattern.builder;

import com.mxz.BuilderPattern.CarModel;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/9/5.
 */
public abstract class CarBuilder {
    //建造一个模型，你要给我一个顺序，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);

    //设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}
