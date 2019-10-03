package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые\
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String>list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
            list.add(reader.readLine());
        }

        int max = list.get(0).length();
        int min = list.get(0).length();

        for (int i = 0; i < list.size(); i++)  ///for for MAX
        {
            if(max < list.get(i).length())
            {
                max = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++)   ///for for MIN
        {
            if (min > list.get(i).length())
            {
                min = list.get(i).length();
            }
        }
    int aa = 0;
    int bb = 0;
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() == min || list.get(i).length() == max)
            {
                System.out.println(list.get(i));
                break;
            }
        }


        //напишите тут ваш код
    }
}
