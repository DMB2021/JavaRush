package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }
        int[] length = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            length[i] = list.get(i).length();
        }
        /*for (int i = 0; i < length.length; i++) {
            System.out.println(length[i]);
        }
        */
        int min = length[0];
        int minIndex = 0;
        for (int i = 1; i < length.length; i++) {
            if (length[i] < min) {min = length[i];
            minIndex = i;
            }
        }
        //System.out.println(min);
        int max = length[0];
        int maxIndex = 0;
        for (int i = 1; i < length.length; i++) {
            if (length[i] > max) {
                max = length[i];
                maxIndex = i;
            }
        }
        //System.out.println("Minimum is " + min);
        //System.out.println("Maximum is " + max);
        if (minIndex < maxIndex) {
            System.out.println(list.get(minIndex));
        } else System.out.println(list.get(maxIndex));


        //System.out.println(minIndex + " " + list.get(minIndex));
    }
}
