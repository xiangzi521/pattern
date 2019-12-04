package com.mxz.CommandPattern.command;

/**
 * Created by Administrator on 2019/9/5.
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    //执行客户的命令
    public void action(){
        this.command.execute();
    }
}
