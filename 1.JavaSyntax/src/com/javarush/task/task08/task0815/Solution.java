package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static int count1 = 0;
    public static int count2 = 0;
    public static Map<String, String> createMap() {


        Map <String, String> map = new HashMap<>();
        map.put("1", "2");
        map.put("2", "3");
        map.put("3", "6");
        map.put("4", "2");
        map.put("5", "8");
        map.put("6", "9");
        map.put("7", "20");
        map.put("8", "1");
        map.put("9", "5");
        map.put("10", "2");

        //напишите тут ваш код
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            if(pair.getValue().equals(name)) count++;
        }
        return count;


    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            if(pair.getKey().equals(lastName)) count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
