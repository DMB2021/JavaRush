package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("adfadsf");
        list.add("ddfds dfsdf");
        list.add("8fsf234kk dfsf");
        list.add("dfdsf dfd1444");
        list.add("dfsdf fdsfj");
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
