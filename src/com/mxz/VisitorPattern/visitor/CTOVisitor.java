package com.mxz.VisitorPattern.visitor;

/**
 * Created by Administrator on 2019/11/22.
 */
public class CTOVisitor implements Visitor1 {
    @Override
    public void visit(Engineer1 engineer1) {
        System.out.println("工程师: " + engineer1.name + ", 代码行数: " + engineer1.getCodeLine());
    }

    @Override
    public void visit(Manager1 manager1) {
        System.out.println("经理: " + manager1.name + ", 产品数量: " + manager1.getProduce());
    }
}
