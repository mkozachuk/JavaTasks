package com.javarush.task.task08.task0813;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String>set = new HashSet<String>();
        int a = 0;
for (int i = 0; i < 20; i++) {
    set.add("ЛЛ1" + a++);
}
      ;



        //напишите тут ваш код
    return set;
    }

    public static void main(String[] args) {
      //  System.out.println(createSet());
        createSet();
      //  System.out.println(createSet());
    }
}
