package com.javarush.task.task08.task0816;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Петров", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Иванов", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Сидоров", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Черножопенко", dateFormat.parse("JUNE 1 2012"));
        map.put("Козленко", dateFormat.parse("JULY 10 2012"));
        map.put("Пидоренко", dateFormat.parse("AUGUST 8 2012"));
        map.put("Нетребко", dateFormat.parse("JUNE 6 2012"));
        map.put("Чморенко", dateFormat.parse("JULY 12 2012"));
        map.put("Петушенко", dateFormat.parse("JULY 19 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        map.values().removeIf(x -> x.getMonth() >= 5 && x.getMonth() <= 7);
        /*
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            int month = pair.getValue().getTime();//напишите тут ваш код
            if (month > 4 && month < 8) {
                remove();
            }
        }
        */
    }

    public static void main(String[] args) throws ParseException {
        /*
        Map<String, Date> mapOfPerson = new HashMap<>();
        mapOfPerson = createMap();
        int month = mapOfPerson.get("Нетребко").getMonth();
        System.out.println(month);
        Date date = mapOfPerson.get("Нетребко");
        System.out.println(mapOfPerson.get("Нетребко"));
        removeAllSummerPeople(mapOfPerson);
        System.out.println(mapOfPerson.get("Нетребко"));
        */
    }
}
