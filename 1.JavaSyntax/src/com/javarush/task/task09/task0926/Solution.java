package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        int[] one = new int[5];
        fillMassiv(one);
        int[] two = new int[2];
        fillMassiv(two);
        int[] three = new int[4];
        fillMassiv(three);
        int[] four = new int[7];
        fillMassiv(four);
        int[] five = new int[0];
        fillMassiv(five);
        ArrayList<int[]> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        /*for (int[] a : list) {

            Arrays.fill(a, b);
        }
         */
        return list;

    }

    public static int[] fillMassiv(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int b = (int) (Math.random()*10);
            list[i] = b;
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
