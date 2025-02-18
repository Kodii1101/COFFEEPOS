package init;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class accountlog extends JFrame{

    public accountlog() {

        //logo path
        String imagePath = "C:/Users/Nelljo/IdeaProjects/COFFEEPOS/src/logo/";

        //images/logo part
        ImageIcon image = new ImageIcon(imagePath + "logo.png");
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
