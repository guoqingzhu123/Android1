package com.example.android.entity;

import java.io.Serializable;

public class Insert implements Serializable {
    public static final String TBL_Insert = "create table if not exists entering(" +
            "id integer primary key autoincrement," +
            "name varchar(20)," +
            "classroom varchar(20)," +
            "age integer(20),";
    private int id;
    private String name;
    private String classroom;
    private int age;

    public Insert(){

    }
    public Insert(String name,String classroom,int age){
        this.name = name;
        this.classroom = classroom;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Insert{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", age=" + age +
                '}';
    }
}
