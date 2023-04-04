package Naloga3;
public class Naloga3 {
    public static void main (String[]args){
        Kocka kocka1 = new Kocka(6);
        Kocka kocka2 = new Kocka(12);
        Kocka kocka3 = new Kocka(20);


        
        System.out.println(kocka1.vrednosti());

        System.out.println(kocka2.metanje());

        System.out.println(kocka3.zaporedje(4));



    }
}
