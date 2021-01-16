package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.Buffer;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
           int current = Integer.parseInt((r.readLine()));
           sum = sum + current;
           if (current == -1)
               break;
        }
        System.out.println(sum);
    }
}
