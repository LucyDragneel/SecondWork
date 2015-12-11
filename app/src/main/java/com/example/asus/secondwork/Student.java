package com.example.asus.secondwork;

import android.widget.ArrayAdapter;

/**
 * Created by asus on 2015/12/10.
 */
public class Student {
    private String name;
    private int grade;
    private String major;
    private int banji;
    public Student(String name,int grade,String major,int banji){
        this.name = name;
        this.grade = grade;
    }
    public String getName(){

        return name;
    }
    public int getGrade(){
        return grade;
    }
    public String getMajor(){
        return major;
    }
    public int getBanji(){
        return banji;
    }
}
