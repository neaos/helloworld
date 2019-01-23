package com.duxihu.helloworld.domain;

import lombok.Data;

/**
 * @program: helloworld
 * @Date: 2019/1/23 9:49
 * @Author: zjhe4
 * @Description:
 */
@Data
public class Student {
    private String name;

    public Student(){}

    public Student(String name){
        this.name = name;
    }
}
