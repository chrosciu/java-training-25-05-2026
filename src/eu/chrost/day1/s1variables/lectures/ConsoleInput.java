package eu.chrost.day1.s1variables.lectures;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        //do wczytywania z konsoli niezbedny jest obiekt Scanner, ktory trzeba stworzyc tak
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        //wczytujemy liczbe jako String
        String input = scanner.nextLine();
        //konwertujemy na int
        //zakladamy ze to jest poprawna liczba - na tym etapie nie przejmujemy sie obsluga bledow
        int firstNumber = Integer.parseInt(input);

        System.out.println("Podaj druga liczbe: ");
        input = scanner.nextLine();
        int secondNumber = Integer.parseInt(input);

        int sum = firstNumber + secondNumber;
        //jak widac w println tez mozna uzyc operatora `+` - nie trzeba tworzyc posredniej zmiennej
        System.out.println("Suma: " + sum);
    }
}
