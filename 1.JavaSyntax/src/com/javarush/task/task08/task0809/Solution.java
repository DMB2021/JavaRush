package com.javarush.task.task08.task0809;

import java.util.*;

/* 
Время для 10 тысяч вставок
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        long first = Calendar.getInstance().getTimeInMillis();// напишите тут ваш код

        insert10000(list);

        long second = Calendar.getInstance().getTimeInMillis();
        long time = second - first;
        return time;//("Отработал за: " + (second - first)/1000f +  " сек.");// напишите тут ваш код

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
