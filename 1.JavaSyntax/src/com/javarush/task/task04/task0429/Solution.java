package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s1);
        int c = Integer.parseInt(s2);
        int m = 0;
        int n = 0;
        if (a < 0 | b < 0 | c < 0)
            n = 1;
        else
            m = 1;
        if (a > 0 && b > 0 || a > 0 && c > 0 || c > 0 && b > 0)
            m = 2;
        else
            n = 2;
        if (a > 0 && b > 0 && c > 0){
            m = 3;
            n = 0;
        }
        else if (a < 0 && b < 0 && c < 0){
            n = 3;
            m = 0;
        }


        System.out.println("количество отрицательных чисел: " + n);
        System.out.println("количество положительных чисел: " + m);




        //напишите тут ваш код

    }
}
