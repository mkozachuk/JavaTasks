package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("APRIL 1 2012"));
        map.put("1Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("2Сталлоне", dateFormat.parse("JUNE 1 2012"));

        map.put("3Сталлоне", dateFormat.parse("JUNE 1 2012"));

        map.put("4Сталлоне", dateFormat.parse("JULY 1 2012"));
        map.put("5Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("6Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("7Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("8Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("9Сталлоне", dateFormat.parse("MAY 1 2012"));
        return map;


        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            String key = pair.getKey();
            Date value = pair.getValue();
            if (value.getMonth() == 5) {
                map.remove();
            }
        }
        System.out.println(map);

    }

    public static void main(String[] args) throws Exception {
        createMap();
        removeAllSummerPeople(createMap());

    }
}
