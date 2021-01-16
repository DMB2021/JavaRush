package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        return cats; //напишите тут ваш код
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<>(); //напишите тут ваш код
        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog();
            dogs.add(dog);
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> joinedSet = new HashSet<>();
        joinedSet.addAll(dogs);
        joinedSet.addAll(cats);
        return joinedSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object anyPet : pets) {
            System.out.println(anyPet);
        }
    }

    public static class Cat {

    }//напишите тут ваш код

    public static class Dog {
    }
}
