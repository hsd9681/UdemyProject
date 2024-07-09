package com.sparta.udemyproject;

import com.sparta.udemyproject.game.GameRunner;
import com.sparta.udemyproject.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        MarioGame marioGame = new MarioGame();
        GameRunner gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}