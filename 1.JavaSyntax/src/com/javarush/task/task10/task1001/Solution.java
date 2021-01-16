package com.javarush.task.task10.task1001;

/* 
Задача №1 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(a);
        int b = a + 46;
        System.out.println(b);
        byte c = (byte) (a * b);
        System.out.println(c);
        double f = (char) 1234.15;
        System.out.println(f);
        long d = (long) (f / c + b);
        System.out.println(d);
        double e = 75.38;
        String sResult = "";
        long numberBits = Double.doubleToLongBits(e);

        sResult = Long.toBinaryString(numberBits);
        System.out.println("Представление вещественного числа в формате чисел с плавающей точкой");

        System.out.format("Число: %5.2f\n", e);
        System.out.println("Формат чисел с плавающей точкой:");

//ведущий ноль заботливо сокращен системой, поэтому его нужно восстановить
        System.out.println(e > 0 ? "0" + sResult : sResult);
    }
}
