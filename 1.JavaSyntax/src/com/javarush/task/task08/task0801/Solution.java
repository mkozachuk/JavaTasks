package com.javarush.task.task08.task0801;

/* 
Set из растений
Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё 10 строк:
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель

Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
while (iterator.hasNext())        //проверка, есть ли ещё элементы
    {
        //получение текущего элемента и переход на следующий
        String text = iterator.next();

        System.out.println(text);
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String>nset = new HashSet<String>();
        nset.add("арбуз");
        nset.add("банан");
        nset.add("вишня");
        nset.add("груша");
        nset.add("дыня");
        nset.add("ежевика");
        nset.add("земляника");
        nset.add("ирис");
        nset.add("картофель");
        nset.add("женьшень");
        Iterator<String>iterator = nset.iterator();

       while (iterator.hasNext())
       {
           String text = iterator.next();
           System.out.println(text);
       }
        //напишите тут ваш код

    }
}
