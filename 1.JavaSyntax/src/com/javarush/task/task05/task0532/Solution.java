package com.javarush.task.task05.task0532;

import java.io.*;

/*
Задача по алгоритмам
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.


*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int maximum = ;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        while (a > 0) {
            int maximum = Integer.MIN_VALUE;
            for (int i = 1; i < (a + 1); i++) {
                int nums = Integer.parseInt(reader.readLine());
                if (nums > maximum) {
                    maximum = nums;
                }
            }
            System.out.println(maximum);
            break;
        }//напишите тут ваш код
    }
}