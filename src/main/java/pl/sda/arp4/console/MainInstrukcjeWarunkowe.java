package pl.sda.arp4.console;

import java.util.Scanner;

public class MainInstrukcjeWarunkowe {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe pierwsza:");
        int liczbapierwsza = scanner.nextInt();

        System.out.println("Podaj liczbe druga");
        int liczbadruga = scanner.nextInt();

        if ( liczbapierwsza > liczbadruga) {
            System.out.println("Liczba pierwsza wieksza od drugiej");
        }
        if ( liczbapierwsza < liczbadruga) {
            System.out.println("Liczba pierwsza mniejsza od drugiej");
        }
        if ( liczbapierwsza == liczbadruga) {
                    System.out.println("Liczba pierwsza mniejsza od drugiej");
          }


            }


    }




