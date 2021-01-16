package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sNum =bufferedReader.readLine();
        int nNum = Integer.parseInt(sNum);
        if (nNum < 1 || nNum > 7) System.out.println("такого дня недели не существует");
        if (nNum == 1) System.out.println("понедельник");
        if (nNum == 2) System.out.println("вторник");
        if (nNum == 3) System.out.println("среда");
        if (nNum == 4) System.out.println("четверг");
        if (nNum == 5) System.out.println("пятница");
        if (nNum == 6) System.out.println("суббота");
        if (nNum == 7) System.out.println("воскресенье");

    }
}