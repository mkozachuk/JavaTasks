package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        boolean f = false;
        int a = 0;
        int b = 0;
        int c = 0;
        if (this.age > anotherCat.age)
            a++;
        else if (this.age < anotherCat.age)
            c++;
        if (this.weight > anotherCat.weight)
            a++;
        else if (this.weight < anotherCat.weight)
            c++;
        if (this.strength > anotherCat.strength)
            a++;
        else if (this.strength < anotherCat.strength)
            c++;
      /*  if (this.age == anotherCat.age)
            b++;
        if (this.strength == anotherCat.strength)
            b++;
        if (this.weight == anotherCat.weight)
            b++;
*/
        if (a > c)
            f = true;
        else
            f = false;
       // if (b >= 2)
       //     f = false;



        return f;









        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
