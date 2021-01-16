package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> mapOfPersons = new HashMap<>();//напишите тут ваш код
        mapOfPersons.put("Иванов", 450);
        mapOfPersons.put("Петров", 487);
        mapOfPersons.put("Сидоров", 520);
        mapOfPersons.put("Васильев", 570);
        mapOfPersons.put("Пупкин", 388);
        mapOfPersons.put("Бубкин", 499);
        mapOfPersons.put("Чуркин", 500);
        mapOfPersons.put("Юркин", 501);
        mapOfPersons.put("Пипкин", 550);
        mapOfPersons.put("Цыпкин", 650);
        return mapOfPersons;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        map.entrySet().removeIf(v -> v.getValue() < 500);//напишите тут ваш код
    }

    public static void main(String[] args) {
        /*
        Map set = createMap();
        System.out.println(set.size());
        removeItemFromMap(set);
        System.out.println(set.size());
        */
    }
}