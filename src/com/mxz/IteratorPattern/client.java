package com.mxz.IteratorPattern;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/9/5.
 */
public class client {
    public static void main(String[] args) {
        ArrayList<IProject> projectList = new ArrayList<>();

        for(int i=1;i<10;i++){
            projectList.add(new Project("第"+i+"个项目",i*5,i*1000000));
        }

        for(IProject project:projectList){
            System.out.println(project.getProjectInfo());
        }
    }
}
