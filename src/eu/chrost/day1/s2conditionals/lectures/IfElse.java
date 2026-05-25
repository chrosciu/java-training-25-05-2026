package eu.chrost.day1.s2conditionals.lectures;

import java.util.Random;

public class IfElse {
    public static void main(String[] args) {
        //instrukcja losujaca liczby calkowite z zakresu 0..9
        int i = new Random().nextInt(10);

        System.out.println("Wylosowana liczba to: " + i);

        if (i < 5) {
            System.out.println("Wylosowana liczba jest mniejsza niz 5");
        }

        //przy jednej instrukcji mozna pominac nawiasy klamrowe - ale taka skladnia jest bardzo niezalecana !
        if (i < 7)
            System.out.println("Wylosowana liczba jest mniejsza niz 7");
            System.out.println("Wylosowana liczba znowu jest mniejsza niz 7"); //ta instrukcja wykona sie zawsze !

        if (i <= 4) {
            System.out.println("Wylosowana liczba jest mniejsza niz lub rowna 4");
        } else {
            //opcjonalny blok do wykonania gdy warunek w if nie jest spelniony
            System.out.println("Wylosowana liczba jest wieksza od 4");
        }
    }
}
