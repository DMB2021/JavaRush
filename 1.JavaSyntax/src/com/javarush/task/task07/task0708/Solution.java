package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(br.readLine());
        }
        int[] length = new int[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            length[i] = strings.get(i).length();
        }
        int max = length[0];
        for (int i = 1; i < length.length; i++) {
            if (length[i] > max) max = length[i];
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == max) System.out.println(strings.get(i));
        }//напишите тут ваш код
    }
}
