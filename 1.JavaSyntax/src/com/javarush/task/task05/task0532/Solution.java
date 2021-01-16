package com.javarush.task.task05.task0532;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int numOfNum = Integer.parseInt(r.readLine());
        if (numOfNum > 0) {
        int numbers[] = new int[numOfNum];
        // System.out.println("число членов массива = " + numOfNum);
            for (int i = 0; i <= numOfNum - 1; i++) {
                numbers[i] = Integer.parseInt(r.readLine());
                // System.out.println(i + "-ый член массива = " + numbers[i]);
            }
            int max = numbers[0];
            for (int k = 1; k <= numOfNum - 1; k++) {
                if (numbers[k] > max) max = numbers[k];
            }
            System.out.println(max);
        }
    }
}
