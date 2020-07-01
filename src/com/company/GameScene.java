package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameScene extends JPanel {

    private Player player;
    private int width;
    private int height;
    private List<Apple> appleList;

    public GameScene(int x, int y, int width, int height){
        this.setBounds(x,y,width,height);
        this.width = width;
        this.height = height;
    }

    public void startGame(){
        System.out.println("The Game Started");
        Graphics graphics = this.getGraphics();
        this.setFocusable(true);
        this.requestFocus();
        PlayerMovement playerMovement = new PlayerMovement();
        this.addKeyListener(playerMovement);
        this.player = new Player(this.width, this.height);
        this.appleList = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < Defenitions.APPLES; i++){
            this.appleList.add(new Apple(random.nextInt(this.width),random.nextInt(this.height),Defenitions.APPLE_SIZE,Defenitions.APPLE_SIZE));
        }

        //The main game loop
        new Thread(()->{
            while (true){
                graphics.clearRect(0,0,width,height);

                if(playerMovement.isKeyPressed(KeyEvent.VK_LEFT)){
                    this.player.moveLeft();
                }
                if(playerMovement.isKeyPressed(KeyEvent.VK_RIGHT)){
                    this.player.moveRight();
                }
                if(playerMovement.isKeyPressed(KeyEvent.VK_UP)){
                    this.player.moveUp();
                }
                if(playerMovement.isKeyPressed(KeyEvent.VK_DOWN)){
                    this.player.moveDown();
                }

                this.player.draw(graphics);

                for(Apple apple: this.appleList){
                    apple.draw(graphics);
                }

                try{
                    Thread.sleep(10);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
