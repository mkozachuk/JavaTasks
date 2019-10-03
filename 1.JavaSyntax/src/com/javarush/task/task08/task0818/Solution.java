package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Ivanow", 700);
        map.put("Ivanow1", 400);
        map.put("Ivanow2", 500);
        map.put("Ivanow3", 600);
        map.put("Ivanow4", 100);
        map.put("Ivanow5", 200);
        map.put("Ivanow6", 1100);
        map.put("Ivanow7", 300);
        map.put("Ivanow8", 200);
        map.put("Ivanow9", 700);
        //напишите тут ваш код
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
       // Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            if(value < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}