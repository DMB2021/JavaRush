package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        List<Integer> nums = new ArrayList<>();
        try {
            String s;
            while (true) {
                s = br.readLine();
                nums.add(Integer.parseInt(s));
            }
        }
        catch (Exception e) {
            for (Integer value : nums) {
                System.out.println(value);
            }
        }
    }
}
