package com.company;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerMovement implements KeyListener {

    private boolean[] pressedKeys = new boolean[123];

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.pressedKeys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.pressedKeys[e.getKeyCode()] = false;
    }

    public boolean isKeyPressed(int keyCode){
        return this.pressedKeys[keyCode];
    }
}
