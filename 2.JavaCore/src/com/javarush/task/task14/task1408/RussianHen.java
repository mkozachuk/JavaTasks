package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{
   // public class RussianHen extends Solution.Hen {
        // Hen hen = new RussianHen();
        @Override
        int getCountOfEggsPerMonth() {
            return 7000;

        }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + "." + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    }


