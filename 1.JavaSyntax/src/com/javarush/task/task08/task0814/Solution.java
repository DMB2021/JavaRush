package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> setOfNum = new HashSet<>();
        Random random = new Random();
        while (setOfNum.size() < 20) {
            setOfNum.add(random.nextInt(30));
        }
        /*
        for (int i = 1; i <= 40; ) {
            setOfNum.add(i);
            i = i + 2;
        }
        */
        return setOfNum;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(x -> x > 10);
        return set;
    }

    public static void main(String[] args) {

        Set<Integer> set = createSet();
        System.out.println(set.size());
        removeAllNumbersGreaterThan10(set);
        System.out.println(set.size());

    }
}
