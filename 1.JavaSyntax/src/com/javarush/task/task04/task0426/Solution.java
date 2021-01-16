package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(r.readLine());
        String s = "ноль";
        if (num != 0) {
            s = num > 0 ? "положительное " : "отрицательное ";
            s += num % 2 == 0 ? "четное число" : "нечетное число";
        }
        System.out.println(s);
    }
}
