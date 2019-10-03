package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String s = reader.readLine();
       int a = Integer.parseInt(s);
       //напишите тут ваш код
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int b = Integer.parseInt(s1);

        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String s2 = reader.readLine();
        int c = Integer.parseInt(s2);
        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");







    }
}