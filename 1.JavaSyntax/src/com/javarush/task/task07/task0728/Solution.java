package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        int temp = 0;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    temp = array[i - 1];//напишите тут ваш код
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
