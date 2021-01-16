package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String sA = in.readLine();
        int a = Integer.parseInt(sA);
        int i = 1;
        String sB = in.readLine();
        int b = Integer.parseInt(sB);
        int j = 2;
        String sC = in.readLine();
        int c = Integer.parseInt(sC);
        int k = 3;
        if (a != b && b == c) System.out.println(i);
        if (b != a && a == c) System.out.println(j);
        if (c != a && a == b) System.out.println(k);

    }
}
