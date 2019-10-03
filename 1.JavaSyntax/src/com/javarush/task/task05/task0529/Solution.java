package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
String s = reader.readLine();
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){

            String num = reader.readLine();
            if(num.equals("сумма"))
                break;
            int numb = Integer.parseInt(num);

            sum = sum + numb;
        }

        System.out.println(sum);
    }
}
