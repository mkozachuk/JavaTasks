package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.


*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] big = new int [20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < big.length; i++){
            big[i] = Integer.parseInt(reader.readLine());
        }
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 9; i >= 0; i--){
            a[i] = big[i];
        }
       for (int i = 9; i >=0; i--){
            b[i] = big[i+10];
        }
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }


        //напишите тут ваш код
    }
}
