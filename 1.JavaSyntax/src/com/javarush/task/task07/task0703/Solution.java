package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов

1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.


*/

public class Solution {
    public static void main(String[] args) throws Exception {
       String[] list = new String[10];
       int[] arr = new int [10];

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       for (int i = 0; i < list.length; i++)
       {
           list[i] = reader.readLine();
       }

       for (int i = 0; i < arr.length; i++ ) {
           arr[i] = list[i].length();
           System.out.println(arr[i]);
       }



       //напишите тут ваш код
    }
}
