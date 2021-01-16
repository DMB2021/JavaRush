package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        for (int i = 5; i > 0; i--) {
            if (a > b) {
                int temp1 = a;
                a = b;
                b = temp1;//напишите тут ваш код
            }
            if (b > c) {
                int temp2 = b;
                b = c;
                c = temp2;
            }
            if (c > d) {
                int temp3 = c;
                c = d;
                d = temp3;
            }
            if (d > e) {
                int temp4 = d;
                d = e;
                e = temp4;
            }
        }
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);
    }
}
