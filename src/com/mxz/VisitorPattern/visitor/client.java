package com.mxz.VisitorPattern.visitor;

/**
 * Created by Administrator on 2019/11/22.
 */
public class client {
    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();
        report.showReport(new CEOVisitor());
        System.out.println("===================");
        report.showReport(new CTOVisitor());
    }
}
