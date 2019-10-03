package com.javarush.games.minesweeper;
import com.javarush.engine.cell.*;

import com.javarush.engine.cell.Game;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;



    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    private void createGame(){
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
               // getRandomNumber(10);
                if (getRandomNumber(10) == 9) {
                    gameField[j][i] = new GameObject(i, j, true);
                   countMinesOnField++;
                }
                else
                    gameField[j][i] = new GameObject(i, j, false);

            }
        }

        for (int i = 0; i < SIDE; i++){
          for(int a = 0; a < SIDE; a++){
              setCellColor(i,a,Color.BLUE);
          }



        }
    }
    private int countMinesOnField;

    private void countMineNeighbors(){

    }


}
