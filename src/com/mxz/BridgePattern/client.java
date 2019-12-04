package com.mxz.BridgePattern;

import com.mxz.BridgePattern.Bridge.House;
import com.mxz.BridgePattern.Bridge.IPod;
import com.mxz.BridgePattern.Bridge.ShanZhaiCrop;

/**
 * Created by Administrator on 2019/9/5.
 */
public class client {
    public static void main(String[] args) {
        System.out.println("房地产公司运营");
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("服装公司运营");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
        System.out.println("\n");
        System.out.println("-------山寨公司是这样运行的-------");
        //ShanZhaiCrop shanZhaiCrop = new ShanZhaiCrop(new Clothes());
        //shanZhaiCrop.makeMoney();
        ShanZhaiCrop shanZhaiCrop = new ShanZhaiCrop(new IPod());
        shanZhaiCrop.makeMoney();
        System.out.println("=====================");
        ShanZhaiCrop crop = new ShanZhaiCrop(new House());
        crop.makeMoney();
        System.out.println("=====================");

        com.mxz.BridgePattern.Bridge.HouseCorp corp = new com.mxz.BridgePattern.Bridge.HouseCorp(new IPod());
        corp.makeMoney();
    }
}
