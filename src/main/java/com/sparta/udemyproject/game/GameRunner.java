package com.sparta.udemyproject.game;


public class GameRunner {
    MarioGame game;


    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("running game"+game); //이거 보다는 로깅 프레임워크를 사용하는게 좋다
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
