package com.javarush.games.game2048;
import com.javarush.engine.cell.*;

import com.javarush.engine.cell.Game;

import javax.print.attribute.standard.Sides;

public class Game2048 extends Game {
    private static final int SIDE = 4;

    private void createGame(){
        createNewNumber();
        createNewNumber();

    }

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(SIDE,SIDE);
        createGame();
        drawScene();

    }

   //private int[][]gameField = new int [SIDE][SIDE];
private int[][]gameField = {
       { 0,0,0,0},
           { 0,0,0,0},
           { 0,0,0,0},
           { 0,0,0,0}
   };

    private void drawScene(){
        for(int i = 0; i < SIDE; i++){
            for(int j = 0; j < SIDE; j++) {
                setCellColoredNumber(i, j, gameField[i][j]);
            }
        }


    }

    private void createNewNumber(){
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        int num;
        if (getRandomNumber(10) == 9){
            num = 4;
        }
        else {
            num = 2;
        }
        while (gameField[x][y] != 0) {
            x = getRandomNumber(SIDE);
            y = getRandomNumber(SIDE);
        }
        
        gameField [x][y] = num;


    }

    private void setCellColoredNumber(int x, int y, int value){
       // getColorByValue(int value);
       // setCellValueEx(int, int, Color, String)
        if (value == 0) setCellValueEx(x, y, getColorByValue(value),"");
        else setCellValueEx(y, x, getColorByValue(value),String.valueOf(value));


    }

    private Color getColorByValue(int value){
        Color color = null;
        if (value == 0) color = Color.WHITESMOKE;
        if (value == 2) color = Color.GREEN;
        if (value == 4) color = Color.ALICEBLUE;
        if (value == 8) color = Color.AZURE;
        if (value == 16) color = Color.FIREBRICK;
        if (value == 32) color = Color.DARKBLUE;
        if (value == 64) color = Color.SADDLEBROWN;
        if (value == 128) color = Color.SALMON;
        if (value == 256) color = Color.SEAGREEN;
        if (value == 512) color = Color.SILVER;
        if (value == 1024) color = Color.SLATEGRAY;
        if (value == 2048) color = Color.YELLOW;

        return color;
    }



}
