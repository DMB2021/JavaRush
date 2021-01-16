package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Please input number");
        String sNum = bufferedReader.readLine();
        int nNum = Integer.parseInt(sNum);
        if (nNum < 0) nNum = nNum + 1;
        if (nNum > 0) nNum = nNum * 2;
        System.out.println(nNum);
//напишите тут ваш код

    }

}