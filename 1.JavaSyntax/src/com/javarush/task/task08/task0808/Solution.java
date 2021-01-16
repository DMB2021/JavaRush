package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        System.out.println(arrayList.size());
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);


        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(777));
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);

    }

    public static List insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add("blabla");//напишите тут ваш код
        }
        //System.out.println(list.size());
        return list;
    }

    public static void get10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);//напишите тут ваш код
        }

    }

    public static void set10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.set(i, new Object());//напишите тут ваш код
        }

    }

    public static void remove10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.remove(0);//напишите тут ваш код
        }

    }
}
