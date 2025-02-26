//current package location
package main.myApp.security;

//import local packages
import java.util.Random;

//import external packages

public class idgen {

    private Random random;

    // Constructor with a seed (for reproducibility)
    public idgen(long seed) {
        this.random = new Random(seed);
        System.out.println("Sulod kos idgen 1 :" + this.random);
        System.out.println("Sulod kos idgen 2 :" + this.random);
    }

    public String generateUserID() {
        System.out.println("sulod kos genUsID :" + this.random);
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder userID = new StringBuilder();
        System.out.println(characters.length()+1);
        for (int i = 0; i < 8; i++) { // 8-character ID
            userID.append(characters.charAt(random.nextInt(characters.length()+1)));
            System.out.println(userID);
        }
        return userID.toString();
    }

}

