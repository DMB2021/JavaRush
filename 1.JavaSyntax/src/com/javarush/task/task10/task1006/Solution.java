package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        double d = (short) 2.50256e2d;
        char c = 'd';
        short s = (short) 2.22;
        int i = 150000;
        float f = 0.50f;
        //System.out.println("d = " + d + " c = " + c + " s = " + s + " i = " + i + " f = " + f);
        //double someResult = (i / c);
        //System.out.println(someResult);
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);
    }
}