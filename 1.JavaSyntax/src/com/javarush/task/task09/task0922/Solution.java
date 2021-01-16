package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String s = br.readLine();
        SimpleDateFormat dfIncome = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat dfOut = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        Date date = dfIncome.parse(s);
        System.out.println(dfOut.format(date).toUpperCase());
        //Calendar cal = new GregorianCalendar();
        //cal.setTime(date);


    }
}
