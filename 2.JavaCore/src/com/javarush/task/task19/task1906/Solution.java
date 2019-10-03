package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        reader.close();
       // FileInputStream fileInputStream = new FileInputStream(first);
        FileReader fileReader = new FileReader(first);

        //FileOutputStream fileOutputStream = new FileOutputStream(second);
        FileWriter fileWriter = new FileWriter(second);
        ArrayList < Integer> list = new ArrayList<>();

        while (fileReader.ready()) {
            int i = fileReader.read();
            list.add(i);
        }
            for ( int a = 1; a < list.size(); a++) {
                // int a = 1;
                if (a % 2 == 1) {
                    fileWriter.write(list.get(a));
                }
               // a++;
            }

        fileReader.close();
        fileWriter.close();









    }
}
