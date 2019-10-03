package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int N = Integer.parseInt(s1);
        int M = Integer.parseInt(s2);
        ArrayList <String> list = new ArrayList();
        for (int i = 0; i < N; i++){
            String s3 = reader.readLine();
            list.add(s3);
        }
        //int a = list.size();
       // int b = a - M - 1;
        int i = M;
        while (i > 0) {
            for (int t = M; t >= 0; t--) {
                String s4 = list.get(t);
                list.remove(t);
                //list.trimToSize();
                list.add(t, s4);

            }
            i--;
        }
        for (int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }
       // System.out.println(list.size());

        //напишите тут ваш код
    }
}
