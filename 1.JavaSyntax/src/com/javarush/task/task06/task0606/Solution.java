package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num < 0)
            num = -num;
        else if (num == 0)
            even++;
        while (num >= 1) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
            num = num / 10;
        }


        System.out.print("Even: " + even + " Odd: " + odd);
        //напишите тут ваш код
    }
}
