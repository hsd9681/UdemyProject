package com.sparta.udemyproject.game;


public class GameRunner {
    private GamingConsole game;


    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    //위처럼 작성한 코드가 특정게임과 강하게 결합되어있다

    public void run() {
        System.out.println("running game"+game); //이거 보다는 로깅 프레임워크를 사용하는게 좋다
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
