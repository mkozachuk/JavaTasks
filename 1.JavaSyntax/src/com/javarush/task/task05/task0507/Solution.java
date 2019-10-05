package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
       float b = 0;
       int count = 0;
       while (true){

           String s = rd.readLine();
           int a = Integer.parseInt(s);

           if (a == -1)
               break;//напишите тут ваш код

           count++;
           b = b + a;

       }
        System.out.println(b/count);
    }
}

