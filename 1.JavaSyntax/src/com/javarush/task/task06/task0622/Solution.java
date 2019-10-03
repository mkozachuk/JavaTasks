package com.javarush.task.task06.task0622;

import javafx.print.Collation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Числа по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int a = 0;
        for (int i = 0; i < 5; i++){
            a = Integer.parseInt(reader.readLine());
            list.add(a);
        }
      //  System.out.println(list);

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //напишите тут ваш код
    }
}
