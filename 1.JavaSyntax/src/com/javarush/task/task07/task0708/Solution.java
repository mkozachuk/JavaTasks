package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

  int min = list[0];
        for (int i = 1; i < list.length; i++)
        {
             if (list[i] < min)
                  min = list[i];
        }

*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String >();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            strings.add(reader.readLine());
        }
        int max = strings.get(0).length();
       // String maxN = list.get(0);
        for (int i = 0; i < strings.size(); i++)
        {

            if(strings.get(i).length() > max){
                max = strings.get(i).length();
             //   maxN = list.get(i);
            }

        }
        for( int i = 0; i < strings.size(); i++ ) {
            if (max == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }
        }






        //напишите тут ваш код
    }
}
