//current package location
package main.myApp;
//import local packages
import main.myApp.view.loginForm;
//import external packages
import main.myApp.security.idgen;



public class Main {
    public static void main(String[] args) {
        // Create an Argon2 instance


        //CALL LOG-IN
         new loginForm().setVisible(true);

         idgen gen1 = new idgen(800);
         idgen gen2 = new idgen(800);

        System.out.println("User ID 1: " + gen1.generateUserID());
        System.out.println("User ID 2: " + gen2.generateUserID());


    }
}
