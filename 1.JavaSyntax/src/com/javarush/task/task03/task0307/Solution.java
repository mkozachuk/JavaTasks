package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

import java.time.chrono.ThaiBuddhistEra;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
Zerg zerg = new Zerg();
zerg.name = "1";

Zerg zerg2 = new Zerg();
        zerg2.name = "2";
Zerg zerg3 = new Zerg();
        zerg3.name = "3";
Zerg zerg4 = new Zerg();
        zerg4.name = "4";
Zerg zerg5 = new Zerg();
        zerg5.name = "5";
Protoss protoss1 = new Protoss();
protoss1.name = "q";
Protoss protoss2 = new Protoss();
protoss2.name = "karl";
Protoss protoss3 = new Protoss();
protoss3.name = "jepta";
Terran terran1 = new Terran();
terran1.name = "b";
        Terran terran2 = new Terran();
        terran2.name = "ivan";

        Terran terran3 = new Terran();
   terran3.name = "yy";
        Terran terran4 = new Terran();
terran4.name = "zz";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
