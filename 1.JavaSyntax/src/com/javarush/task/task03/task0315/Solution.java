package com.javarush.task.task03.task0315;

/* 
Каждый охотник желает знать…
*/

import static java.awt.Color.orange;

public class Solution {
    public static void main(String[] args) {
        Red re1 = new Red();
        Orange or2 = new Orange();
        Yellow ye3 = new Yellow();
        Green gr4 = new Green();
        Blue bl5 = new Blue();
        Indigo in6 = new Indigo();
        Violet vio7 = new Violet();
       //напишите тут ваш код
    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
