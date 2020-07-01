package com.company;
import javax.swing.*;
import java.awt.*;

public class OptionsMenu extends JPanel {
    private JButton startGameBtn;
    private JButton pauseGameBtn;
    private JButton exitGameBtn;

    public OptionsMenu(GameScene gameScene, int width, int height){
        this.setBounds(0,0,width,height);
        this.setBackground(Color.RED);
        this.startGameBtn = new JButton("Start");
        this.pauseGameBtn = new JButton("Pause");
        this.exitGameBtn = new JButton("Exit");
        this.add(this.startGameBtn);
        this.add(this.pauseGameBtn);
        this.add(this.exitGameBtn);

        this.startGameBtn.addActionListener((e -> gameScene.startGame()));

    }
}
