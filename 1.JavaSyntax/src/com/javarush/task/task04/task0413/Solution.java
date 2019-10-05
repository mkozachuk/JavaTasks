package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String day = reader.readLine();
       int dday = Integer.parseInt(day);
       if (dday < 1 )
            System.out.println("такого дня недели не существует");
       if (dday >7 )
            System.out.println("такого дня недели не существует");
       if (dday == 1)
           System.out.println("понедельник");
       if (dday == 2)
           System.out.println("вторник");
       if (dday ==3)
           System.out.println("среда");
       if (dday == 4)
           System.out.println("четверг");
       if (dday == 5)
           System.out.println("пятница");
       if (dday == 6)
           System.out.println("суббота");
       if (dday == 7)
           System.out.println("воскресенье");





       //напишите тут ваш код

    }
}