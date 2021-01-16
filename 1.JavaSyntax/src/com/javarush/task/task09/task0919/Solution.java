package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

import org.w3c.dom.ls.LSOutput;

public class Solution {

    public static void main(String[] args) {
        try {
            Solution.divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        int i = 10;
        int y = i / 0;
        System.out.println(y);
    }
}
