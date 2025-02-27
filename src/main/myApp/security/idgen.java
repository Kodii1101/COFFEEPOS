//current package location
package main.myApp.security;

//import local packages
import java.util.Random;
//import external packages

public class idgen {

    private int seed;

    // Constructor with a seed (for reproducibility)
    public idgen(int seed) {
        this.seed = seed;
        System.out.println("Sulod kos idgen 1 :" + this.seed);

    }

    public String generateUserID() {
        String userID;
        seed += 0x6D2B79F5;
        int t = seed;
        t = (t ^ (t >>> 15)) * (1 | t);
        t = (t ^ (t >>> 7)) * (61 | t);
        //System.out.println("sulod kos genUsID :" + seed + t);
        return String.valueOf(((t ^ (t >>> 14)) >>> 0) / 4294967296.0f);
    }

}

/* public String generateUserID() {
        System.out.println("sulod kos genUsID :" + this.random);
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder userID = new StringBuilder();
        System.out.println(characters.length()+1);
        for (int i = 0; i < 8; i++) { // 8-character ID
            userID.append(characters.charAt(random.nextInt(characters.length()+1)));
            System.out.println(userID);
        }
        return userID.toString();
    }*/