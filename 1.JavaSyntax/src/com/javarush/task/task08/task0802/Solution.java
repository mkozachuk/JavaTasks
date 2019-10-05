package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String >mmap = new HashMap<String, String>();
        mmap.put("арбуз", "ягода");
        mmap.put("банан", "трава");
        mmap.put("вишня", "ягода");
        mmap.put("груша", "фрукт");
        mmap.put("дыня", "овощ");
        mmap.put("ежевика", "куст");
        mmap.put("жень-шень", "корень");
        mmap.put("земляника", "ягода");
        mmap.put("ирис", "цветок");
        mmap.put("картофель", "клубень");
        Iterator<Map.Entry<String, String >>iterator = mmap.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String word = pair.getValue();
            System.out.println(key + " - " + word);
        }


    }
}
