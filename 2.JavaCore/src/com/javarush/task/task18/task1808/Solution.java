package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName3);

        int size = fileInputStream.available();
        byte[] buffer = new byte[size];
        fileInputStream.read(buffer);

        int half1 = size / 2 + size % 2;
        int half2 = size - half1;

        fileOutputStream.write(buffer,0,half1);
        fileOutputStream1.write(buffer,half1, half2);

        reader.close();
        fileInputStream.close();
        fileOutputStream.close();
        fileOutputStream1.close();




    }
}
