package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        if (a < b && a < c && a < d && a < e) {
            return a;
        }
        else if (a >= b && b <= c && b <= d && b <= e) {
            return b;
        }
        else if (c <= b && a >= c && c <= d && c <= e) {
            return c;
        }
        else if (d <= b && d <= c && a >= d && d <= e) {
            return d;
        }
        else if (e <= b && e <= c && e <= d && a >= e) {
            return e;
        }
        return 10;
    }
}
