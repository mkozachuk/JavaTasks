package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String s = reader.readLine();
       String s1 =reader.readLine();



       for (int m = Integer.parseInt(s); m > 0; m--) {
             //напишите тут ваш код

           for (int n = Integer.parseInt(s1); n > 0; n--) {

               System.out.print(8);
           }
           System.out.println();
       }

    }
}
