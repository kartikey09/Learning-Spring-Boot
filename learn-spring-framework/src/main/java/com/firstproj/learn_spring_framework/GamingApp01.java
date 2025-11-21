package com.firstproj.learn_spring_framework;

import com.firstproj.learn_spring_framework.game.GameRunner;
import com.firstproj.learn_spring_framework.game.MarioGame;
import com.firstproj.learn_spring_framework.game.PacManGame;
import com.firstproj.learn_spring_framework.game.SuperContraGame;

public class GamingApp01 {
    public static void main(String args[]){
        var GamingConsole1 = new MarioGame();
        var GamingConsole2 = new SuperContraGame();
        var GamingConsole3 = new PacManGame();
        var gameRunner2 = new GameRunner(GamingConsole2);
        var gameRunner1 = new GameRunner(GamingConsole1);
        var gameRunner3 = new GameRunner(GamingConsole3);
//        gameRunner1.run();
//        gameRunner2.run();
        gameRunner3.run();

    }
}
