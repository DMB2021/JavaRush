package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();

    }

    public static int getStackTraceDepth() {
        StackTraceElement[] a = Thread.currentThread().getStackTrace();//напишите тут ваш код
        System.out.println(a.length);
        return a.length;
    }
}

