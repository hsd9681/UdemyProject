package com.sparta.udemyproject;

import com.sparta.udemyproject.game.GameRunner;
import com.sparta.udemyproject.game.MarioGame;
import com.sparta.udemyproject.game.PacmanGame;
import com.sparta.udemyproject.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        //MarioGame game = new MarioGame();
        //SuperContraGame game = new SuperContraGame();
        PacmanGame game = new PacmanGame();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}