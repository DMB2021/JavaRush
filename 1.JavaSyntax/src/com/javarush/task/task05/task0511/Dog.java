package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    private String name = null;
    private int height;
    private String color = null;
    public void initialize (String name) {
        this.name = name;
    }
    public void initialize (String name, int height) {
        this.height = height;
        this.name = name;
    }
    public void initialize (String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}