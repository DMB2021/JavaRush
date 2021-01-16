package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> firstGeneration1 = new ArrayList<>();
        ArrayList<Human> firstGeneration2 = new ArrayList<>();
        ArrayList<Human> secondGeneration = new ArrayList<>();
        Human ded1 = new Human("Василий", true, 87, firstGeneration1);
        Human ded2 = new Human("Иван", true, 88, firstGeneration2);
        Human babka1 = new Human("Матрёна", false, 81, firstGeneration1);
        Human babka2 = new Human("Акулина", false, 80, firstGeneration2);
        Human son1 = new Human("Семён", true, 56, secondGeneration);
        Human daughter1 = new Human("Анна", false, 53, secondGeneration);
        Human son2 = new Human("Михаил", true, 30);
        Human son3 = new Human("Пётр", true, 28);
        Human daughter2 = new Human("Наталья", false, 24);
        firstGeneration1.add(son1);
        firstGeneration2.add(daughter1);
        secondGeneration.add(son2);
        secondGeneration.add(son3);
        secondGeneration.add(daughter2);
        System.out.println(ded1);//напишите тут ваш код
        System.out.println(ded2);
        System.out.println(babka1);
        System.out.println(babka2);
        System.out.println(son1);
        System.out.println(daughter1);
        System.out.println(son2);
        System.out.println(son3);
        System.out.println(daughter2);
    }

    public static class Human {
        String name = null;//напишите тут ваш код
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            //int childCount = this.children.size();
            int childCount = Objects.isNull(this.children) ? 0 : this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
