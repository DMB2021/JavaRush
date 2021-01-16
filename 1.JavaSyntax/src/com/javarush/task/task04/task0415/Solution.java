package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sa = bufferedReader.readLine();
        int a = Integer.parseInt(sa);
        String sb = bufferedReader.readLine();
        int b = Integer.parseInt(sb);
        String sc = bufferedReader.readLine();
        int c = Integer.parseInt(sc);
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) System.out.println("Треугольник существует.");
        else {
            System.out.println("Треугольник не существует.");
        }

    }
}