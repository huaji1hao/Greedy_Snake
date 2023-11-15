package com.megasnake.game.utils;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class DirectionHandler implements EventHandler<KeyEvent> {
    private static int currentDirection;
    private static int nextDirection;
    public static final int RIGHT = 0;
    public static final int LEFT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;

    public DirectionHandler(int initialDirection) {
        this.currentDirection = initialDirection;
        this.nextDirection = initialDirection;
    }

    @Override
    public void handle(KeyEvent event) {
        KeyCode code = event.getCode();
        if (code == KeyCode.RIGHT || code == KeyCode.D) {
            if (currentDirection != LEFT) {
                nextDirection = RIGHT;
            }
        } else if (code == KeyCode.LEFT || code == KeyCode.A) {
            if (currentDirection != RIGHT) {
                nextDirection = LEFT;
            }
        } else if (code == KeyCode.UP || code == KeyCode.W) {
            if (currentDirection != DOWN) {
                nextDirection = UP;
            }
        } else if (code == KeyCode.DOWN || code == KeyCode.S) {
            if (currentDirection != UP) {
                nextDirection = DOWN;
            }
        }
    }
    public static void setCurrentDirection(int direction) {
        currentDirection = direction;
    }

    public static int getCurrentDirection() {
        return currentDirection;
    }

    public static int getNextDirection() {
        return nextDirection;
    }

}