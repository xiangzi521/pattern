package com.mxz.BuilderPattern;

import com.mxz.BuilderPattern.builder.BMWBuilder;
import com.mxz.BuilderPattern.builder.BenzBuilder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/9/5.
 */
public class client {
    public static void main(String[] args) {
        BMWModel bmw = new BMWModel();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engineboom");
        sequence.add("stop");
        sequence.add("start");

        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        //制造出一个奔驰车
        BenzModel benz = (BenzModel)benzBuilder.getCarModel();
        //奔驰车跑一下看看
        benz.run();
        System.out.println("=========================");
        //按照同样的顺序，我再要一个宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw1 = (BMWModel)bmwBuilder.getCarModel();
        bmw1.run();

    }
}
