package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadanie3DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz tekst");
        String tekst = scanner.nextLine();

        do {

            System.out.println(tekst.toUpperCase());}
            while (tekst.equals("quite")) ;

        }
    }


