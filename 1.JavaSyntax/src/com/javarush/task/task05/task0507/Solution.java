package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int counter = 0;
        while (true) {
            int currentValue = Integer.parseInt(r.readLine());
            if (currentValue == -1)
                break;
            counter++;
            //System.out.println(counter);
            sum = sum + currentValue;
            //System.out.println(sum);
        }
        //System.out.println(sum);
        //System.out.println(counter);
        double avg = (double)sum/(double)counter;
        System.out.println(avg);
    }
}

