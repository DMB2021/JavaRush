package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m = reader.readLine();

        DateFormat dataFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        Date some = dataFormat.parse(m);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(some);
        int month = calendar.get(Calendar.MONTH) + 1;

        System.out.println(m + " is the " + month + " month");

        List<String> months = new ArrayList<>();//напишите тут ваш код
    }
}
