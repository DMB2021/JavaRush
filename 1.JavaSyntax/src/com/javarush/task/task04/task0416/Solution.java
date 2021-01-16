package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String sMinute = bufferedReader.readLine();
        double dMinute = Double.parseDouble(sMinute);
        if (dMinute % 5 < 3) {  System.out.println("зелёный");
        }
        else {
            if (dMinute % 5 < 4) {
                System.out.println("жёлтый");
            }
            else System.out.println("красный");
        }
    }
}