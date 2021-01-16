package com.javarush.task.task03.task0325;

/* 
Финансовые ожидания
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Please input expecting salary value");
        String sSalary = bufferedReader.readLine();
        int nSalary = Integer.parseInt(sSalary);
        System.out.println("Я буду зарабатывать $" + nSalary + " в час");
//напишите тут ваш код

    }
}
