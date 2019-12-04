package com.mxz.CommandPattern.command;

/**
 * Created by Administrator on 2019/9/5.
 */
public class CodeCommand extends Command {
    //执行删除一个页面的命令
    public void execute() {
//找到页面组
        super.cg.find();
//删除一个页面
        super.cg.delete();
//给出计划
        super.cg.plan();
    }
}
