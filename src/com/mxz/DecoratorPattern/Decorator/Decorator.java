package com.mxz.DecoratorPattern.Decorator;

import com.mxz.DecoratorPattern.common.SchoolReport;

/**
 * Created by Administrator on 2019/9/5.
 */
public class Decorator extends SchoolReport {

    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
