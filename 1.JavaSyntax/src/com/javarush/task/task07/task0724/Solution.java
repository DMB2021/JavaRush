package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> family = new ArrayList<Human>();

        Human ivan = new Human("Иван", true, 75);
        family.add(ivan);

        Human tonya = new Human("Антонина", false, 74);
        family.add(tonya);

        Human onotole = new Human("Анатолий", true, 81);
        family.add(onotole);

        Human julia = new Human("Юлия", false, 82);
        family.add(julia);

        Human dima = new Human("Дмитрий", true, 49, ivan, tonya);
        family.add(dima);

        Human sveta = new Human("Светлана", false, 47, onotole, julia);
        family.add(sveta);

        Human petya = new Human("Пётр", true, 22, dima, sveta);
        family.add(petya);

        Human tanya = new Human("Татьяна", false, 18, dima, sveta);
        family.add(tanya);

        Human serega = new Human("Сергей", true, 14, dima, sveta);
        family.add(serega);

        for (Human human : family) {
            System.out.println(human.toString());
        }
        // напишите тут ваш код
    }

    public static class Human {
        String name = null;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }// напишите тут ваш код

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}