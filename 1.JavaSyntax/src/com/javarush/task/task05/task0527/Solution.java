package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Dog dogBob = new Dog ("Bob", 20, 30);

        Cat catTom = new Cat ("Tom", 21, 16);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int speed;
        int strength;

        public Dog(String name, int speed, int strength) {
            this.name = name;
            this.speed = speed;
            this.strength = strength;
        }
    }

    public static class Cat {
        String name;
        int speed;
        int cunning;

        public Cat(String name, int speed, int cunning) {
            this.name = name;
            this.speed = speed;
            this.cunning = cunning;
        }
    }
}
