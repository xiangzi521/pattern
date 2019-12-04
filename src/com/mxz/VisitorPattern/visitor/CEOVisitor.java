package com.mxz.VisitorPattern.visitor;

/**
 * Created by Administrator on 2019/11/22.
 */
public class CEOVisitor implements Visitor1 {
    @Override
    public void visit(Engineer1 engineer1) {
        System.out.println("工程师: " + engineer1.name + ", KPI: " + engineer1.kpi);
    }

    @Override
    public void visit(Manager1 manager1) {
        System.out.println("经理: " + manager1.name + ", KPI: " + manager1.kpi +
                ", 新产品数量: " + manager1.getProduce());
    }
}
