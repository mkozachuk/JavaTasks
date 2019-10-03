package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        int max = 0;
        while (inputStream.available() > 0) {
            int bytes = inputStream.read();
            if ( bytes > max)
                max = bytes;
        }
        System.out.println(max);
        inputStream.close();







    }
}
