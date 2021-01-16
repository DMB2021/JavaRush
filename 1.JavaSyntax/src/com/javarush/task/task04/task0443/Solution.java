package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name = r.readLine();
        String y = r.readLine();
        String m = r.readLine();
        String d = r.readLine();
        System.out.printf("Меня зовут %s.\n", name);
        System.out.printf("Я родился %s.%s.%s", d, m, y);

    }
}
