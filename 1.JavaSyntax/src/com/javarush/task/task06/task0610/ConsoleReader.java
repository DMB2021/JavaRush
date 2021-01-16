package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        return s;//напишите тут ваш код

    }

    public static int readInt() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(r.readLine());
        return i;//напишите тут ваш код

    }

    public static double readDouble() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(r.readLine());
        return d;//напишите тут ваш код//напишите тут ваш код

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        boolean b = Boolean.parseBoolean(r.readLine());
        return b;//напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {

    }
}
