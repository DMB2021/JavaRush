package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(785));
    }
    //System.out.println("Input 3-digits number");
    //public BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //String sNum = bufferedReader.readLine();
    //int number = Integer.parseInt(sNum);
    public static int sumDigitsInNumber(int number) {
        int a = number / 100;
        //System.out.println("Number of hundreds is" + a);
        //int b = number / 10 - a * 10;
        int b = number / 10 % 10;
        //System.out.println("Number of decades is " + b);
        //int c = number - (a * 100 + b * 10);
        int c = number % 10;
        //System.out.println("Number of units is " + c);
        int sum = a + b + c;
        return sum;//напишите тут ваш код
    }
    //System.out.println("Sum of digits in number is" + sumDigitsInNumber(number));
}