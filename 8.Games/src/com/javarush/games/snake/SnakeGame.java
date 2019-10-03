package com.javarush.games.snake;
import com.javarush.engine.cell.*;

public class SnakeGame extends Game {
    public void initialize(){
        setScreenSize(15,15);
        createGame();


    }
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private Snake snake;



    private void drawScene() {


        // setCellValueEx(x, y,Color.DARKSEAGREEN,"");
        //
        //
         for (int x = 0; x < WIDTH; x++) {
                    for (int y = 0; y < HEIGHT; y++) {
                        setCellValueEx(x, y, Color.DARKSEAGREEN, "");
    }
}



         snake.draw(this);
         apple.draw(this);


    }

    private Apple apple;
    private void createGame(){
        snake = new Snake(WIDTH / 2, HEIGHT / 2);
        createNewApple();
        drawScene();
       // Apple apple = new Apple(7,7);
        //apple.draw(this);
        turnDelay = 300;
        setTurnTimer(turnDelay);



    }
    public void setCellColor(){
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellColor(x, y, Color.GREEN);
            }
        }
    }


    @Override
    public void onTurn(int step) {
        //super.onTurn(step);
        snake.move(apple);
        if (apple.isAlive == false){
            createNewApple();
        }
        drawScene();
    }
    private int turnDelay;

    @Override
    public void onKeyPress(Key key) {
       // super.onKeyPress(key);
        if (key == Key.LEFT) {
            snake.setDirection(Direction.LEFT);
        }
        else if (key == Key.DOWN){
            snake.setDirection(Direction.DOWN);
        }
        else if (key == Key.RIGHT){
            snake.setDirection(Direction.RIGHT);
        }
        else if (key == Key.UP){
            snake.setDirection(Direction.UP);
        }


    }
    private void createNewApple(){
        Apple apple = new Apple(getRandomNumber(WIDTH),getRandomNumber(HEIGHT));
        this.apple = apple;
    }
}
