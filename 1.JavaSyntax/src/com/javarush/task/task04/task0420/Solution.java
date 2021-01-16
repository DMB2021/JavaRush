package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String sA = in.readLine();
        String sB = in.readLine();
        String sC = in.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        int z;
        if (a < b) {
            z = b;
            b = a;
            a = z;
        }
        if (b < c) {
            z = b;
            b = c;
            c = z;
        }
        if (a < b) {
            z = b;
            b = a;
            a = z;
        }
        System.out.println(a + " " + b + " " + c);

    }
}
