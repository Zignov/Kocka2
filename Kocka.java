package Naloga3;

import java.util.Random;


public class Kocka {
    public int stPloskev;
    Random rand = new Random();

    public Kocka(int stPloskev){
        this.stPloskev = stPloskev;
    }


    public int vrednosti(){
        return vrednosti();
    }

    public int metanje(){
        int random = rand.nextInt(stPloskev);
        return random;
    }

    public String zaporedje(int poskusov){
        
        int[] zaporedjePoskusov = new int[poskusov];
        for (int i = 0; i<poskusov; i++){
            zaporedjePoskusov[i] = rand.nextInt(stPloskev);
        }

        return zaporedjePoskusov.toString();
    }
}
