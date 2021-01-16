package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainList = new ArrayList<Integer>();//напишите тут ваш код
        ArrayList<Integer> divideOnTwo = new ArrayList<Integer>();
        ArrayList<Integer> divideOnThree = new ArrayList<Integer>();
        ArrayList<Integer> listOfRest = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            mainList.add(i, Integer.parseInt(br.readLine()));
            if (mainList.get(i) % 3 == 0)
                divideOnTwo.add(mainList.get(i));
            if (mainList.get(i) % 2 == 0)
                divideOnThree.add(mainList.get(i));
            if (mainList.get(i) % 2 != 0 && mainList.get(i) % 3 != 0)
                listOfRest.add(mainList.get(i));
        }

        printList(divideOnTwo);
        printList(divideOnThree);
        printList(listOfRest);
    }



    public static void printList(ArrayList<Integer> list) {
        for (Integer number : list) {
            System.out.println(number);//напишите тут ваш код
        }
    }
}
