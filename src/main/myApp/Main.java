package main.myApp;

import main.myApp.security.security;

import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {

        //CALL LOG-IN
        JLabel label = new JLabel();
        label.setText("Are you sureeeee?");

        security logIn = new security();
        logIn.add(label);

    }
}