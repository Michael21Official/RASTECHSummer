package dev.michael21official.RASTECHSummer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int n;
        while(true) {
            System.out.print("Wpisz liczbę ilości kaczuszek N: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();// ilość kaczuszek
                break;
            } else {
                System.out.println("To nie jest liczba całkowita! Spróbuj ponownie.");
                scanner.next();
            }
        }
        int m;
        while(true) {
            System.out.print("Wpisz maksymalną szerokość rzędu M: ");
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();// maksymalna szerokość rzędu
                break;
            } else {
                System.out.println("To nie jest liczba całkowita! Spróbuj ponownie.");
                scanner.next();
            }
        }
        int sumHeight = 0; // suma wysokości ustawionych kaczuszek
        List<Kaczuszka> kaczuszki = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int w;
            while(true) {
                System.out.print("Wpisz wysokość kaczuszki: ");
                if (scanner.hasNextInt()) {
                    w = scanner.nextInt();// wysokość kaczuszki
                    break;
                } else {
                    System.out.println("To nie jest liczba całkowita! Spróbuj ponownie.");
                    scanner.next();
                }
            }
            int s;
            while(true) {
                System.out.print("Wpisz szerokość kaczuszki: ");
                if (scanner.hasNextInt()) {
                    s = scanner.nextInt();// szerokość kaczuszki
                    break;
                } else {
                    System.out.println("To nie jest liczba całkowita! Spróbuj ponownie.");
                    scanner.next();
                }
            }
            kaczuszki.add(new Kaczuszka(w, s));
        }
        // sortowanie kaczuszek malejąco według wysokości
        Collections.sort(kaczuszki, Collections.reverseOrder());
        // ustawianie kaczuszek w rzędzie
        for (Kaczuszka k : kaczuszki) {
            if (m >= k.s) {
                sumHeight += k.w;
                m -= k.s;
            }
        }
        System.out.println(sumHeight); // wypisanie sumy wysokości ustawionych kaczuszek
    }

    public static int calculateSumHeight(int m, List<Kaczuszka> kaczuszki) {
        if (kaczuszki.isEmpty()) {
            return 0; // or throw an exception to indicate there are no ducks
        }
        int sumHeight = 0;
        // sortowanie kaczuszek malejąco według wysokości
        Collections.sort(kaczuszki, Collections.reverseOrder());
        // ustawianie kaczuszek w rzędzie
        for (Kaczuszka k : kaczuszki) {
            if (m >= k.s) {
                sumHeight += k.w;
                m -= k.s;
            }
        }
        return sumHeight;
    }

}

