package com.nadia.gaming;

public class MarioGame  implements GamingConsole {
    public void up() {
        System.out.println("Mario Jumpes");
    }
    public void down() {
        System.out.println("Mario goes into a hole");
    }
    public void left() {
        System.out.println("Mario goes back");
}

    public void right() {
        System.out.println("Mario goes RIGHT");
    }
}
