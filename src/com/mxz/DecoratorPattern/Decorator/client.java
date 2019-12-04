package com.mxz.DecoratorPattern.Decorator;

import com.mxz.DecoratorPattern.common.FouthGradeSchoolReport;
import com.mxz.DecoratorPattern.common.SchoolReport;

/**
 * Created by Administrator on 2019/9/5.
 */
public class client {
    public static void main(String[] args) {
        SchoolReport sr;
        //原装的成绩单
        sr = new FouthGradeSchoolReport();
        //加 了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        //又加了成绩排名的说明
        sr = new SortDecorator(sr);
        //看成绩单
        sr.report();
        //签名
        sr.sign("老三");

    }
}
