package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = 3;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(r.readLine()) > 0) count++;
        }
        /*String sa = bufferedReader.readLine();
        int a = Integer.parseInt(sa);
        String sb = bufferedReader.readLine();
        int b = Integer.parseInt(sb);
        String sc = bufferedReader.readLine();
        int c = Integer.parseInt(sc);
        int n;
        if (a > 0 && b > 0 && c > 0) n = 3;
        else {
            if (a < 0 && b < 0 && c < 0) n = 0;
                else {
                    if ((a < 0 && b < 0 ) || (b < 0 && c < 0) || (a < 0 && c < 0)) n = 1;
                        else {
                        n = 2;
                }
            }
        }*/
        System.out.println(count);
    }
}
