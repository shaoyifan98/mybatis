package com.yifan.pojo;

import lombok.*;


@Data
public class Student {
    private int id;
    private String name;
    private Teacher teacher;
}
