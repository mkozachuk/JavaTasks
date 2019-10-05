package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s  = reader.readLine();
      int a = Integer.parseInt(s);

      BufferedReader reader1 = new BufferedReader((new InputStreamReader(System.in)));
      String s1 = reader1.readLine();
      int b = Integer.parseInt(s1);

      if ( a < b || a == b)
          System.out.println(a);
      else
          System.out.println(b);
   //напишите тут ваш код

    }
}