package com.mxz.VisitorPattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2019/11/22.
 */
public class BusinessReport {

    private List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport(){
        mStaffs.add(new Manager1("经理-A"));
        mStaffs.add(new Manager1("经理-B"));
        mStaffs.add(new Manager1("经理-C"));
        mStaffs.add(new Engineer1("工程师-A"));
        mStaffs.add(new Engineer1("工程师-B"));
        mStaffs.add(new Engineer1("工程师-C"));
    }

    public void showReport(Visitor1 visitor1){
        for (Staff staff : mStaffs) {
            staff.accept(visitor1);
        }
    }
}
