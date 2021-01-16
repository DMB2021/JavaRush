package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;


    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        while (n != 0) {
            if (n % 2 == 0)
            { even++;
                }
            else odd++;
            n = n / 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);//напишите тут ваш код
    }
}
