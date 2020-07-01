package com.company;
import javax.swing.*;

public class Window extends JFrame {

    private OptionsMenu optionsMenu;
    private GameScene scene;

    public Window(){
        this.setSize(Defenitions.WINDOW_WIDTH, Defenitions.WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Snake");
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.scene = new GameScene(Defenitions.WINDOW_WIDTH/5, 0, Defenitions.WINDOW_WIDTH,Defenitions.WINDOW_HEIGHT);
        this.add(this.scene);
        this.optionsMenu = new OptionsMenu(this.scene,Defenitions.WINDOW_WIDTH/5,Defenitions.WINDOW_HEIGHT);
        this.add(this.optionsMenu);


        this.setVisible(true);
    }
}
