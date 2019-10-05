package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
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
       if (a > 0 && b > 0 && c > 0)
           System.out.println(3);
       else if (a > 0 && b > 0)
           System.out.println(2);
       else if (b > 0 && c > 0 || a > 0 && c > 0)
           System.out.println(2);
       else if (a > 0 || b > 0 || c > 0)
           System.out.println(1);
       else if (a <= 0 && b <= 0 && c <= 0)
           System.out.println(0);


    }
}
