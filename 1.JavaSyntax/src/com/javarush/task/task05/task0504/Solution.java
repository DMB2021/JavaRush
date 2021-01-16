package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat catVaska = new Cat ("Vaska", 4, 3, 4);
        Cat catBarsik = new Cat ("Barsik", 4, 3, 3);
        Cat catMurzik = new Cat ("Murzik", 3, 2, 2);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat (String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}