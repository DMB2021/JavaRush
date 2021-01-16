package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);


        System.out.println("Minimum = " + minimum);
    }


    //public static int min(int a, int b, int c, int d, int e) {
    public static int min(int a, int b, int c, int d, int e) {
        int[] numbers = new int[5];
        numbers[0] = a;
        numbers[1] = b;
        numbers[2] = c;
        numbers[3] = d;
        numbers[4] = e;
        int min = a;
        for(int i = 0; i<numbers.length;i++){
            if(numbers[i] <= min){
                min = numbers[i];
            }
        }
        return min;
        //return a < b ? a : b;
    }
}
