package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader1.readLine();
        int b = Integer.parseInt(s1);

        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String s2 = reader2.readLine();
        int c = Integer.parseInt(s2);

        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        String s3 = reader.readLine();
        int d = Integer.parseInt(s3);//напишите тут ваш код

        if (a >= b && a >= c && a >= d)
            System.out.println(a);
        else if (b >= a && b >= c && b >= d)
            System.out.println(b);
        else if (c >= a && c >= b && c >= d)
            System.out.println(c);
        else if (d >= a && d >= b && d >= c)
            System.out.println(d);
        else if (a == b && a == c && a == d)
            System.out.println(a);

    }
}
