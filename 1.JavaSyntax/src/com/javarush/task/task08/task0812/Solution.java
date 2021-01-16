package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> listOfNum = new ArrayList<>();//напишите тут ваш код
        fill(listOfNum);
        int maxSequence = 1;
        int counter = 1;
        for (int i = 1; i < listOfNum.size(); i++)
        {
            //System.out.println("Iteration # " + i);//int counter = 1;
            if (listOfNum.get(i).equals(listOfNum.get(i - 1)))
            {
                counter++;
                //System.out.println("counter = " + counter);
                if (counter > maxSequence)
                {
                    maxSequence = counter;
                }
            }
                else counter = 1;//System.out.println("counter = " + counter);
        }

                /* else if (counter > maxSequence) {
                    maxSequence = counter;
                    counter = 1;
                } */

        System.out.println(maxSequence);
    }

    public static List fill(List list) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        return list;
    }
}
