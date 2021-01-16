package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код. step 3 - пункт 3
        Set<Cat> cats = createCats();
        //System.out.println(cats.size()); //печатаем количество объектов в наборе
        cats.remove(cats.toArray()[0]); //преобразуем Set котов в массив и удаляем 0-вой элемент в нём
        //System.out.println(cats.size()); //печатаем количество объектов в наборе
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //создаём набор котов, создаём котов и добавляем их в набор
        Set<Cat> cats = new HashSet<>();//напишите тут ваш код. step 2 - пункт 2
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        /*
        Iterator<Cat> iterator = cats.iterator(); //создаём итератор для набора котов
        while (iterator.hasNext()) { //пока есть следующий объект в наборе
            Cat current = iterator.next();
            System.out.println(current);
        }// step 4 - пункт 4
        */
        //так короче
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
    // step 1 - пункт 1
    public static class Cat {
        /*
        String name = null;
        public Cat(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return "Cat with name " + name;
            */
        }
    }

