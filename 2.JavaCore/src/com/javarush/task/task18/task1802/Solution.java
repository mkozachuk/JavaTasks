package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream file = new FileInputStream(s);
        int min = 100;
        while (file.available() > 0){
            int read = file.read();
            if (read < min)
                min = read;
        }
        System.out.println(min);
        file.close();
    }
}
