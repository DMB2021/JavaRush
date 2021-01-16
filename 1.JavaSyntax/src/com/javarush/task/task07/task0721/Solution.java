package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = getInts();
        int maximum;
        maximum = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > maximum)
                maximum = list[i];
        }
        int minimum;
        minimum = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < minimum) minimum = list[i];
        }
        //int maximum;
        //int minimum;

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        for (int i = 0; i < 20; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        return list;
    }
}
