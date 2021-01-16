package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 3 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        /*
        //Рабочее решение вариант 1
        DateFormat dateFormat = new SimpleDateFormat("D", Locale.ENGLISH); // создаем новый формат для даты
        Date toSearch = new Date(date); // создаем объект типа Дата из входной строки
        int x = Integer.parseInt(dateFormat.format(toSearch)); // преобразуем дату в кол-во дней, согласно заданному формату, преобразуем её в строку (метод format), и парсим эту строку в целое число
        return x % 2 != 0; // возвращаем true в случае нечетного числа, и false в случае четного
        */
        // рабочее решение вариант 2 (без парсинга в целое число)
        Calendar cal = Calendar.getInstance(); // создаем объект cal класса Calendar и устанавливаем его значение в текущую дату/время (для простоты)
        cal.setTime(new Date(Date.parse(date))); // теперь создаем объект класса Date, парсим в него строку из входных параметров. И устанавливаем время календаря cal согласно этому объекту класса Date

        return cal.get(Calendar.DAY_OF_YEAR) % 2 != 0; // получаем количество дней с начала года для объекта cal, возвращаем true в случае нечетного числа, и false в случае четного
    }
}
