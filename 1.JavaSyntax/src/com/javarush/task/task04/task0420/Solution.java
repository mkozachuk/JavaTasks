package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);

        BufferedReader reader1 = new BufferedReader(new InputStreamReader((System.in)));
        String s1 = reader1.readLine();
        int b = Integer.parseInt(s1);

        BufferedReader reader2 = new BufferedReader((new InputStreamReader(System.in)));
        String s2 = reader2.readLine();
        int c = Integer.parseInt(s2);

        if (a <= b && b <= c)
            System.out.println(c + " " + b + " " + a);
        else if (b <= a && a <= c)
            System.out.println((c + " " + a + " " + b));
        else if (c <= a && a <= b)
            System.out.println(b + " " + a + " " + c);





        //напишите тут ваш код

    }
}
