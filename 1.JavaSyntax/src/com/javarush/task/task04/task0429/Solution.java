package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = 3;
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < n; i++) {
            int d = Integer.parseInt(r.readLine());
            if (d > 0) countPositive++;
            if (d < 0) countNegative++;
        }
        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);
    }
}
