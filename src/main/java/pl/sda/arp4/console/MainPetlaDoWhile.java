package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPetlaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe pierwsza:");
        int liczba = scanner.nextInt();

        int i = 0;

        do {
            System.out.println("Hello World");


            i++;

        }while (i < liczba);
    }
}
