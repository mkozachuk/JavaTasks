package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
 Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.


*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer>set = new HashSet<Integer>();

        set.add(10);
        set.add(11);
        set.add(9);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(15);
        set.add(4);
        set.add(17);
        set.add(71);
        set.add(711);
        set.add(7111);
        set.add(71111);
        set.add(120);
        set.add(119);
        set.add(118);
        set.add(117);
        set.add(116);
        set.add(115);
        set.add(114);


return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> integerIterator = set.iterator();
        // напишите тут ваш код
        while (integerIterator.hasNext()){
            Integer text = integerIterator.next();
            if (text > 10){
                integerIterator.remove();
            }
        }
        return set;
      //  System.out.println(set);
//return set;
    }

    public static void main(String[] args) {

    }
}
