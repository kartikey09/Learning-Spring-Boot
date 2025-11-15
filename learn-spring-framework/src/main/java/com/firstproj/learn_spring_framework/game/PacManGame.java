package com.firstproj.learn_spring_framework.game;

import com.firstproj.learn_spring_framework.GamingConsole;

public class PacManGame implements GamingConsole {
    public void up(){
        System.out.println("Pac up");
    }
    public void down(){
        System.out.println("Pac down");
    }
    public void left(){
        System.out.println("Pac left");
    }
    public void right(){
        System.out.println("Pac right");
    }
}
