package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
Улицы и дома
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - число жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.


*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] num = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(reader.readLine());
        }
        int[] a = new int[15];
        int[] b = new int[15];

        for(int i = 14; i >= 0; i--){
            if (i % 2 == 0){
                a[i] = num[i];
            }
            else b[i] = num[i];
        }
        int suma = 0;
        int sumb = 0;
        for (int i = 0; i < a.length; i++)
        {
            suma += a[i];
        }
        for(int i = 0; i < b.length; i++)
        {
            sumb += b[i];
        }

        if (suma > sumb)
        {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else
        {
            System.out.printf("В домах с нечетными номерами проживает больше жителей.");
        }







        //напишите тут ваш код
    }
}
