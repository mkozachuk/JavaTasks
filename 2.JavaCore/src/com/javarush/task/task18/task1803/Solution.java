package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> myList = new ArrayList<Integer>();
        ArrayList<Integer> myList2 = new ArrayList<Integer>();
        String file = sc.nextLine();
        FileInputStream inputStream = new FileInputStream(file);

        while (inputStream.available() > 0) {
            myList.add(inputStream.read());
        }
        inputStream.close();

        int iterations = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (Collections.frequency(myList, myList.get(i)) > iterations) {

                iterations = Collections.frequency(myList, myList.get(i));
            }
        }

        for (int i = 0; i < myList.size(); i++) {
            if (Collections.frequency(myList, myList.get(i)) == iterations) {
                if (!myList2.contains(myList.get(i))) {
                    System.out.print(myList.get(i) + " ");
                    myList2.add(myList.get(i));
                }
            }
        }
    }
}