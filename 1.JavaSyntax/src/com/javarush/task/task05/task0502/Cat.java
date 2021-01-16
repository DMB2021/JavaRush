package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat () {
        }

    public boolean fight(Cat anotherCat) {
        int cat1Score = 0;
        int cat2Score = 0;
        int ageScore = Integer.compare(this.age, anotherCat.age);
        if (ageScore > 0) cat1Score++;
        if (ageScore < 0) cat2Score++;
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        if (weightScore > 0) cat1Score++;
        if (weightScore < 0) cat2Score++;
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);
        if (strengthScore > 0) cat1Score++;
        if (strengthScore < 0) cat2Score++;
        //System.out.println("ageScore = " + ageScore + " weightScore = " + weightScore + " strengthScore = " + strengthScore);
        return cat1Score > cat2Score ? true : false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 4;
        cat1.weight = 5;
        cat1.strength = 6;
        Cat cat2 = new Cat();
        cat2.age = 6;
        cat2.weight = 4;
        cat2.strength = 5;
        System.out.println(cat1.fight(cat2));
    }
}
