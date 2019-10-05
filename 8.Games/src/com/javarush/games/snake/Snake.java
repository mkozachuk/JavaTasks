package com.javarush.games.snake;
import com.javarush.engine.cell.*;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    public boolean isAlive = true;
    private List<GameObject>snakeParts = new ArrayList<>();
    private final static String HEAD_SIGN = "\uD83D\uDC7E";
    private final static String BODY_SIGN = "\u26AB";
    public void draw(Game game){
        if (isAlive) {
            game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, Color.BLACK, 75);
            game.setCellValueEx(snakeParts.get(1).x, snakeParts.get(1).y, Color.NONE, BODY_SIGN, Color.BLACK, 75);
            game.setCellValueEx(snakeParts.get(2).x, snakeParts.get(2).y, Color.NONE, BODY_SIGN, Color.BLACK, 75);
        }
        else{
            game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE ,HEAD_SIGN, Color.RED, 75);
            game.setCellValueEx(snakeParts.get(1).x, snakeParts.get(1).y, Color.NONE, BODY_SIGN, Color.RED, 75);
            game.setCellValueEx(snakeParts.get(2).x, snakeParts.get(2).y, Color.NONE, BODY_SIGN, Color.RED, 75);

        }


    }
    private Direction direction = Direction.LEFT;

    public void setDirection(Direction direction) {

        if (direction == Direction.LEFT && this.direction == Direction.RIGHT){
            return;
        }
        if (direction == Direction.UP && this.direction == Direction.DOWN){
            return;
        }
        if (direction == Direction.RIGHT && this.direction == Direction.LEFT){
            return;
        }
        if (direction == Direction.DOWN && this.direction == Direction.UP){
            return;
        }



        this.direction = direction;

    }

   // public void setDirection(){

  //  }

public void move(Apple apple){
      /*  createNewHead();
        snakeParts.add(0,createNewHead());
        removeTail();
        if(createNewHead().x > 15 || createNewHead().y >15){
            isAlive = false;
        }
*/



    GameObject newHead = createNewHead();

    if (newHead.x == apple.x && newHead.y == apple.y){
        apple.isAlive = false;
    }

   else if (newHead.x < 0 || newHead.x >= SnakeGame.WIDTH
            || newHead.y < 0 || newHead.y >= SnakeGame.HEIGHT) {
        isAlive = false;
    }
    else {
        snakeParts.add(0, newHead);
        removeTail();
    }


}


    public Snake(int x,int y){

        GameObject obj1 = new GameObject(x, y);
        GameObject obj2 = new GameObject(x + 1, y);
        GameObject obj3 = new GameObject(x + 2,y);
        snakeParts.add(0,obj1);
        snakeParts.add(1,obj2);
        snakeParts.add(2,obj3);


    }

  public GameObject createNewHead(){

        if(direction == Direction.LEFT) {
            GameObject newHead = new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);
            return newHead;
        }
        else if(direction == Direction.DOWN){
            GameObject newHead = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y + 1);
            return newHead;
        }
        else if(direction == Direction.RIGHT){
            GameObject newHead = new GameObject(snakeParts.get(0).x + 1, snakeParts.get(0).y);
            return newHead;
        }
        else// (direction == Direction.UP)
             {
            GameObject newHead = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y - 1);
            return newHead;
        }


        //return newHead;

  }

  public void removeTail(){
        int size = snakeParts.size() - 1;
        snakeParts.remove(size);

  }

  public boolean checkCollision(GameObject gameObject){
return true; //its shit shold be removed;
  }

}
