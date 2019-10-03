package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int [20];
        int maximum = mas[0];
        int minimum = mas[0];

        //напишите тут ваш код

        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            mas[i] = a;
        }
        int min = mas[0];
        for (int i = 0; i < 20; i++ ){
            if(mas[i] <= min){
                min = mas[i];
            }
            minimum = min;
        }
        int max = 0;
        for (int i = 0; i < 20; i++){
            if (mas[i] > max){
                max = mas[i];
            }
            maximum = max;
        }


        System.out.print(maximum + " " + minimum);
    }
}
