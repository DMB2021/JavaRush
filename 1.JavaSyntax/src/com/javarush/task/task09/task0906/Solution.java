package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/


public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement[] a = Thread.currentThread().getStackTrace();//напишите тут ваш код
        System.out.println(a[2].getClassName() + ": " + a[2].getMethodName() + ": " + text);
    }
}
