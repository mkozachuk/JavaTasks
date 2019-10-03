package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int dday = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = Integer.parseInt(s);

     /*   if (x % 400 == 0)
            dday = 366;
        if (x % 400 == 0 && x % 100 == 0);
            dday = 365;
        if (x % 400 == 0 && x % 100 == 0 && x % 4 == 0);
        dday = 366;
        if (x % 100 == 0)
            dday = 365;
*/
        if (x % 400 == 0 || (x % 100 != 0 && x % 4 == 0)) dday = 366;
        else dday = 365;

        System.out.println("количество дней в году: " + dday);  //напишите тут ваш код

    }
}