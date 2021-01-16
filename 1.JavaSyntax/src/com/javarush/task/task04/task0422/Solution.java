package com.javarush.task.task04.task0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name = in.readLine();
        String nX = in.readLine();
        int x = Integer.parseInt(nX);
        if (x < 18) System.out.println("Подрасти еще");

    }
}
