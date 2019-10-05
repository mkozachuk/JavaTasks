package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rd = reader.readLine();
        return rd;

        //напишите тут ваш код

    }

    public static int readInt() throws Exception {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader1.readLine());
        return n;

        //напишите тут ваш код

    }

    public static double readDouble() throws Exception {
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(reader2.readLine());
        return d;


        //напишите тут ваш код

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        boolean b = Boolean.parseBoolean(reader3.readLine());
        return b;


        //напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {

    }
}
