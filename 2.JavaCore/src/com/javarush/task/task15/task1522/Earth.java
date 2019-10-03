package com.javarush.task.task15.task1522;

public class Earth implements Planet {
    private static Earth instance; //#1
    private Earth(){}
    public static Earth getInstance(){
        if ( instance == null){
            instance = new Earth();
        }
        return instance;
    }
}
