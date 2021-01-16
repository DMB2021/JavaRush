package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(br.readLine());
        }
        int[] length = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            length[i] = list.get(i).length();
        }
        int min = length[0];
        for (int i = 1; i < length.length; i++) {
            if (length[i] < min) min = length[i];
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min) System.out.println(list.get(i));
        }
    }
}
