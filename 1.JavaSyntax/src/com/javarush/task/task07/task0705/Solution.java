package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] big20 = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < big20.length; i++) {
            big20[i] = Integer.parseInt(br.readLine());//напишите тут ваш код
        }
        int[] small1 = new int[10];
        int[] small2 = new int[10];
        int half = big20.length / 2;
        for (int i = 0; i < half; i++) {
            small1[i] = big20[i];
        }
        //System.out.println(small1[9]);
        for (int i = half; i <= big20.length - 1; i++) {
            small2[i - 10] = big20[i];
        }
        for (int i = 0; i < small2.length; i++) {
            System.out.println(small2[i]);
        }
    }
}
