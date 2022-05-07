package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadanie2DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        do {

        System.out.println("Podaj liczbe:");
        liczba = scanner.nextInt();


        }while (liczba>0);

        System.out.println("koniec:");
    }
}
