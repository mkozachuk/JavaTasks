package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer>arrayList = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int count = 1;
        int a = 1;
        int b = 0;
        int count = 1;
        int max = 1;
        for (int i = 0; i < 10; i++)
        {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
       // int count = 1;
        //int max = 1;
        for (int i=0; i<arrayList.size()-1;i++)
        {
            if (arrayList.get(i).equals(arrayList.get(i + 1)))
            {
                count++;
                if (max < count)
                    max = count;
            }
            else
                count=1;
        }
        System.out.println(max);








    }
}