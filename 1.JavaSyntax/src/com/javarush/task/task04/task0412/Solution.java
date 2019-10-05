package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     String number = reader.readLine();
     int num = Integer.parseInt(number);
        if (num == 0)
            System.out.println(num);//напишите тут ваш код
     if (num < 0) {
        num = num + 1;
         System.out.println(num);
     }
     if (num > 0) {
         num = num * 2;
         System.out.println(num);
     }


    }

}