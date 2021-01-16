package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Абакумова", "Елена");
        map.put("Балакирев", "Дмитрий");
        map.put("Бакшеев", "Ефим");
        map.put("Бутримов", "Владимир");
        map.put("Белова", "Татьяна");
        map.put("Артемьева", "Наталья");
        map.put("Богословская", "Татьяна");
        map.put("Герасимов", "Дмитрий");
        map.put("Герасимов", "Кирилл");
        map.put("Конева", "Наталья");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
