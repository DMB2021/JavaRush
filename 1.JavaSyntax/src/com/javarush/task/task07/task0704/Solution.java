package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] massiv = new int[10];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = Integer.parseInt(r.readLine());
        }

        for (int j = massiv.length - 1 ; j >= 0 ; j--) {
            System.out.println(massiv[j]);
        }
    }
}

