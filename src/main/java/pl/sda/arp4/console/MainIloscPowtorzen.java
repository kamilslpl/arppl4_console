package pl.sda.arp4.console;

import java.util.Scanner;

public class MainIloscPowtorzen {
    public static void main(String[] args) {
        System.out.println("zaczynamy");
        //wejscie programu
        Scanner scanner = new Scanner(System.in);
        // Pytamy o imie:
        System.out.println("Podaj ilosc powtorzen:");
        int iloscpowtirzen = scanner.nextInt();


        for (int i = 0; i < iloscpowtirzen ; i++) {

            System.out.println( "Hello world po raz " + i);


        }


    }
}
