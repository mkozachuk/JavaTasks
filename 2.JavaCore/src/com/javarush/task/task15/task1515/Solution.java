package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
1. В статическом блоке считайте две переменные с консоли А и В с типом int.
2. Не забыть про IOException, который надо обработать в блоке catch.
3. Закрыть поток ввода методом close().


*/

public class Solution {
    public static int A;
    public static int B;
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try {
           String a = reader.readLine();
           String b = reader.readLine();
           A = new Integer(a);
           B = new Integer(b);
           reader.close();

       } catch (IOException e) {
           e.printStackTrace();
       }


    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
