package com.sparta.udemyproject;

import com.sparta.udemyproject.game.GameRunner;
import com.sparta.udemyproject.game.MarioGame;
import com.sparta.udemyproject.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        //MarioGame marioGame = new MarioGame();
        SuperContraGame superContraGame = new SuperContraGame();
        GameRunner gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}