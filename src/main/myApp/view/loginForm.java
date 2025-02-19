//current package location
package main.myApp.view;

//import local packages

//import external packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class loginForm extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, cancelButton;

    public loginForm(){
        //frame settings
        setTitle("COFFEE POINT OF SALE");
        setSize(620,420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 50, 10));

        //conversion of path
        String imagePath = System.getProperty("user.dir");
        imagePath = imagePath.replace("\\","/");

        //logo location from source dir
        ImageIcon image = new ImageIcon( imagePath + "/src/main/resources/logo/logo.png");
        setIconImage(image.getImage());
        getContentPane().setBackground(new Color(245,240,240));


        //UI components
        //username
        add(new JLabel("Username :"));
        usernameField = new JTextField();
        add(usernameField);
        //password
        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);
        //buttons
        loginButton = new JButton("Login");
        cancelButton = new JButton("Cancel");
        add(loginButton);
        add(cancelButton);

    }
/*
    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }*/
}
