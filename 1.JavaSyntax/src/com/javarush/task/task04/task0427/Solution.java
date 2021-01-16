package com.javarush.task.task04.task0427;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        if (a > 0 && a < 1000) {
            String x;
            if (a % 2 == 0) x = "четное ";
            else x = "нечетное ";
            String y;
            if (a > 99) y = "трехзначное ";
            else {
                if (a > 9) y = "двузначное ";
                else y = "однозначное ";
            }
            System.out.println(x + y + "число");
        }
    }
}
