package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      String[] list = new String[10];
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      for (int i = 0; i < 8; i++) {
          list[i] = reader.readLine();
      }

      for (int i = 9; i >= 0; i--)
        {
            System.out.println(list[i]);
        }




        //напишите тут ваш код
    }
}