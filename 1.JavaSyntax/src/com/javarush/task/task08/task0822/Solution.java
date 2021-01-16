package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        Collections.sort(array);// Найти минимум тут
        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// Создать и заполнить список тут
        List<Integer> listOfNums = new ArrayList<>();
        int listLength = Integer.parseInt(br.readLine());
        for (int i = 0; i < listLength; i++) {
            listOfNums.add(Integer.parseInt(br.readLine()));
        }
        return listOfNums;
    }
}
