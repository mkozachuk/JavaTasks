package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум

1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива


*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int [] mas = new int[20];
       for (int i = 0; i < mas.length; i++)
           mas [i] = Integer.parseInt(reader.readLine());

       // создай и заполни массив
        return mas;
    }

    public static int max(int[] array) {

        /*
            int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int min = list[0];
        for (int i = 1; i < list.length; i++)
        {
             if (list[i] < min)
                  min = list[i];
        }
         */

        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
                max = array[i];
        }

        // найди максимальное значение
        return max;
    }
}
