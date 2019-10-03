package com.javarush.games.snake;
import com.javarush.engine.cell.*;

public class Apple extends GameObject {
    int x;
    int y;
    public boolean isAlive = true;
    public Apple(int x, int y){
        super(x, y);
        this.x = x;
        this.y = y;
    }

    private final static String APPLE_SIGN = "\uD83C\uDF4E";
    public void draw(Game game){
        game.setCellValueEx(x,y,Color.NONE,APPLE_SIGN,Color.RED,75);

    }

}
