package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name = null;
    int age;
    int weight;
    String color = null;
    String address = null;
    int avgAge = 3;
    int avgWeight = 3;
    String avgColor = "Grey";

    public void initialize (String name) {
        this.name = name;
        this.age = avgAge;
        this.weight = avgWeight;
        this.color = avgColor;
    }

    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = avgColor;
    }

    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = avgWeight;
        this.color = avgColor;
    }

    public void initialize (int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = avgAge;
    }

    public void initialize (int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = avgAge;
    }

    public static void main(String[] args) {

    }
}
