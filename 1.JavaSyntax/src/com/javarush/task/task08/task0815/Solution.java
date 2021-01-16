package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
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
        map.put("Забелин", "Кирилл");
        map.put("Конева", "Татьяна");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();//напишите тут ваш код
        int countTheSameFirstName = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            //String key = pair.getKey();
            if (value.equals(name)) countTheSameFirstName++;
        }
        return countTheSameFirstName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();//напишите тут ваш код
        int countTheSameLastName = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            //String value = pair.getValue();
            String key = pair.getKey();
            if (key.equals(lastName)) countTheSameLastName++;
        }
        return countTheSameLastName;
    }

    public static void main(String[] args) {
        Map<String, String> nameMap = createMap();
        System.out.println(getCountTheSameFirstName(nameMap, "Татьяна"));

    }
}
