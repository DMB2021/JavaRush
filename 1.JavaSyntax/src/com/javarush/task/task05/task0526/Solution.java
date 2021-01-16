package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man manVasya = new Man("Vasya", 32, "Moscow");
        Man manPetya = new Man("Petya", 33, "Voronezh");

        Woman womanMasha = new Woman("Masha", 26, "Kaluga");
        Woman womanDasha = new Woman("Dasha", 28, "Kirov");

        System.out.println(manVasya);
        System.out.println(manPetya);
        System.out.println(womanMasha);
        System.out.println(womanDasha);
        }

    public static class Man
    {
        String name;
        int age;
        String address;

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }

    public static class Woman {
        String name;
        int age;
        String address;

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }
}
