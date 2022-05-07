package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPetlaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe pierwsza:");
        int liczba = scanner.nextInt();

        do {
            System.out.println("Hello World");

            liczba--;

        }while (liczba>1);
    }
}
