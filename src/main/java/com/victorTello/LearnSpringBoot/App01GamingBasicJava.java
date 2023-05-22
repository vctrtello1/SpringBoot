package com.victorTello.LearnSpringBoot;

import com.victorTello.LearnSpringBoot.game.GameRunner;
//import com.victorTello.LearnSpringBoot.game.MarioGame;
// import com.victorTello.LearnSpringBoot.game.SuperContraGame;
import com.victorTello.LearnSpringBoot.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        //var game = new MarioGame();
        //var superContraGame = new SuperContraGame();
        var game = new PacmanGame();
        
        var gameRunner = new GameRunner(game);
        gameRunner.run();

        

    }
}
