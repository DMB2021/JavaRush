package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] massiv = new String[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <= 7; i++) {
            massiv[i] = br.readLine();
        }

        for (int j = massiv.length - 1 ; j >= 0 ; j--) {
            System.out.println(massiv[j]);
        }
    }
}