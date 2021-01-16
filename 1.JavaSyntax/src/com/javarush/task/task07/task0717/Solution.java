package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();// Считать строки с консоли и объявить ArrayList list тут
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(i, br.readLine());
        }
        ArrayList<String> result = doubleValues(list);
        for (int i = 0; i < list.size() * 2; i++) {
            System.out.println(result.get(i));// Вывести на экран result
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<String>();//напишите тут ваш код
        for (int i = 0; i < list.size();i++) {
            result.add(list.get(i));
            result.add(list.get(i));
        }
        return result;
    }
}
