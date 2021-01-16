package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy"); //задаем формат вывода даты
        Date date = new Date(); //вызываем конструктор текущей даты, присваиваем значение текущей даты объекту date
        System.out.println(dateFormat.format(date)); //выводим на печать
    }
}
