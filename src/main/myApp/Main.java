package main.myApp;

import main.myApp.security.accountlog;

import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {

        //CALL LOG-IN
        JLabel label = new JLabel();
        label.setText("Are you sureeeee?");

        accountlog logIn = new accountlog();
        logIn.add(label);

    }
}