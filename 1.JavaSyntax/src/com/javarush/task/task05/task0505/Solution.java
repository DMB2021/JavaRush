package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        Cat catVaska = new Cat("Vaska", 6, 6, 8);
        Cat catBarsik = new Cat("Barsik", 5, 6, 8);
        Cat catMurzik = new Cat("Murzik", 4, 4,9);
        System.out.println(catVaska.fight(catBarsik));
        System.out.println(catVaska.fight(catMurzik));
        System.out.println(catBarsik.fight(catMurzik));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
