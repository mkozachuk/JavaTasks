package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String text = "";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(name));
        while (text.compareTo("exit") != 0){
            text = reader.readLine();
            bufferedWriter.write(text);
            bufferedWriter.write(name);
            bufferedWriter.flush();
        }
        bufferedWriter.close();
        reader.close();

        // напишите тут ваш код
    }
}
