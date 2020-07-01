package com.company;

import java.awt.*;

public class Player {
    private int x;
    private int y;
    private int width;
    private int height;
    private int sceneWidth;
    private int sceneHeight;

    public Player(int sceneWidth, int sceneHeight){
        this.x = 100;
        this.y = 400;
        this.width = 50;
        this.height = 50;
        this.sceneHeight = sceneHeight;
        this.sceneWidth = sceneWidth;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw(Graphics graphics){
        graphics.fillRect(this.x,this.y,this.width,this.height);
    }

    public void moveLeft(){
        if(this.x > 0){
            this.x--;
        }
    }

    public void moveRight(){
        if(this.sceneWidth - this.width > this.x){
            this.x++;
        }
    }

    public void moveUp(){
        if(this.y > 0){
            this.y--;
        }
    }

    public void moveDown(){
        if(this.sceneHeight - this.height > this.y){
            this.y++;
        }
    }

}
