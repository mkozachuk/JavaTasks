package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(s);
        ArrayList <Integer> list = new ArrayList<>();
        byte c = (char) 44;
        int count =0;
        while (fileInputStream.available() > 0){
            if (fileInputStream.read() == 44)
           // list.add(fileInputStream.read());
            count++;
        }
        fileInputStream.close();
        //for (int i = list.size(); i > 0; i--){
         //   if (list.get(i) != c){
          //      list.remove(i);
          //  }
       // }
        System.out.println(count);








    }
}
