package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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



        if (a == b && b == c)
            System.out.println(a + " " + b + " " + c);
        else if (a == b)
            System.out.println(a + " " + b);
        else if (b == c)
            System.out.println(b + " " + c);
        else if (c == a)
            System.out.println(c + " " + a);//напишите тут ваш код

    }
}