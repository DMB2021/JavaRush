package com.javarush.task.task08.task0817;

import org.w3c.dom.ls.LSOutput;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();//напишите тут ваш код
        map.put("Абакумова", "Елена");
        map.put("Балакирев", "Дмитрий");
        map.put("Бакшеев", "Ефим");
        map.put("Бутримов", "Владимир");
        map.put("Белова", "Татьяна");
        map.put("Артемьева", "Наталья");
        map.put("Богословская", "Татьяна");
        map.put("Герасимов", "Дмитрий");
        map.put("Забелин", "Кирилл");
        map.put("Конева", "Наталья");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //String firstNameToRemove = "Наталья";//напишите тут ваш код
        Map<String, String> copy1 = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy1.entrySet()) {
            String value = pair.getValue();
           // System.out.println(value);
            int count = 0;
            for (Map.Entry<String, String> pair1 : copy1.entrySet()) {
                if (pair1.getValue().equals(value)) {
                    count++;
                 //   System.out.println(count);
                }
                if (count > 1) {
                    removeItemFromMapByValue(map, value);
                }
            }
        }
     //   Collections.frequency((map.values(), firstNameToRemove);
     //   removeItemFromMapByValue(map, firstNameToRemove);

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        /*
        Map<String, String> listOfClass = createMap();
        System.out.println(listOfClass.size());
        System.out.println(listOfClass.get("Герасимов"));
        removeTheFirstNameDuplicates(listOfClass);
        System.out.println(listOfClass.size());
        System.out.println(listOfClass.get("Герасимов"));
        */
    }
}
