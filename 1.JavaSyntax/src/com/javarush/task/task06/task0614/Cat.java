package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();;//напишите тут ваш код

    public Cat() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat());//напишите тут ваш код
        }
        printCats();
    }

    public static void printCats() {
        cats.forEach(System.out::println);//напишите тут ваш код
    }
}