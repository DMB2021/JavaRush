package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 50000; i++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
            //System.out.println("Создан кот с именем " + cat.name);// напишите тут ваш код
        }
        //System.out.println(cat);
    }
}

class Cat {
    /*int name;
    Cat (int name) {
        this.name = name;
    }*/
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
        }
    }

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
