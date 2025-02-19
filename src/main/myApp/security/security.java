package main.myApp.security;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class security extends JFrame{

    public security() {

        //conversion of path
        String imagePath = System.getProperty("user.dir");
        imagePath = imagePath.replace("\\","/");

        //images/main.resources.logo part
        ImageIcon image = new ImageIcon( imagePath + "/src/main/resources/logo/logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(245,240,240));

        //frame settings
        this.setTitle("COFFEE POINT OF SALE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
