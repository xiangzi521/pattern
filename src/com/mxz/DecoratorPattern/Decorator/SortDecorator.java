package com.mxz.DecoratorPattern.Decorator;

import com.mxz.DecoratorPattern.common.SchoolReport;

/**
 * Created by Administrator on 2019/9/5.
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    //告诉老爸学校的排名情况
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
