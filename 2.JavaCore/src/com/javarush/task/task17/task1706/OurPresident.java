package com.javarush.task.task17.task1706;

public class OurPresident {

    private static OurPresident president;

    public static OurPresident getOurPresident() {
        return president;
    }

    private OurPresident() {

    }

    static {
        synchronized (OurPresident.class) {
            president = new OurPresident();
        }
    }
}