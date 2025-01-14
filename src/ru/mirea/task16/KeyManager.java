package ru.mirea.task16;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {
    private boolean[] keys, justPressed, cantPress;
    public boolean up, down, left, right;
    public boolean aUp, aDown, aLeft, aRight;

    public KeyManager(){
        keys = new boolean[256];
        justPressed = new boolean[keys.length];
        cantPress = new boolean[keys.length];
    }

    public void tick(){
        for(int i = 0;i < keys.length;i++){
            if(cantPress[i] && !keys[i]){
                cantPress[i] = false;
            }else if(justPressed[i]){
                cantPress[i] = true;
                justPressed[i] = false;
            }
            if(!cantPress[i] && keys[i]){
                justPressed[i] = true;
            }
        }

        up = keys[KeyEvent.VK_Q];
        down = keys[KeyEvent.VK_A];
        left = keys[KeyEvent.VK_P];
        right = keys[KeyEvent.VK_L];

        aUp = keys[KeyEvent.VK_I];
        aDown = keys[KeyEvent.VK_K];
        aLeft = keys[KeyEvent.VK_J];
        aRight = keys[KeyEvent.VK_L];
    }

    public boolean keyJustPressed(int keyCode){
        if(keyCode < 0 || keyCode >= keys.length)
            return false;
        return justPressed[keyCode];
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() < 0 || e.getKeyCode() >= keys.length)
            return;
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() < 0 || e.getKeyCode() >= keys.length)
            return;
        keys[e.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
