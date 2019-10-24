package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));

        String read = fileReader.readLine();
        String res = "";
        fileReader.close();

        for (String str: read.split("//W")){
            res = res + Integer.parseInt(read) + " ";
        }

        bufferedWriter.write(res);
        bufferedWriter.flush();
        bufferedWriter.close();



    }
}
