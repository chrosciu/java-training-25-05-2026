package eu.chrost.day1.s2conditionals.lectures;

import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        int i = new Random().nextInt(10);

        System.out.println("Wylosowana liczba to: " + i);

        int remainderByFour = i % 4;

        //dziala ale jest strasznie rozwlekle
        if (remainderByFour == 0) {
            System.out.println("Wylosowana liczba jest podzielna przez 4");
        } else if (remainderByFour == 1) {
            System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 1");
        } else if (remainderByFour == 2) {
            System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 2");
        } else {
            System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 3");
        }

        //nowsza wersja switch - dostepna od Javy 13
        switch (remainderByFour) {
            case 0 -> {
                System.out.println("Wylosowana liczba jest podzielna przez 4");
                System.out.println("Druga instrukcja");
            }
            case 1 -> System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 1");
            case 2 -> System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 2");
            case 3 -> System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 3");
            //lub tez alternatywnie - galaz ktora wykona sie gdy nie zostana "zlapane" zadne inne
            default -> System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 3");
        }

        //starsza wersja switch - przed Java 13
        //obecnie niezalecana - mniejsza czytelnosc + pulapki zwiazane z instrukcja break
        switch (remainderByFour) {
            case 0:
                System.out.println("Wylosowana liczba jest podzielna przez 4");
                //przy braku instrukcji break wykona sie rowniez kod z kolejnej galezi !
                break;
            case 1:
                System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 1");
                break;
            case 2:
                System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 2");
                break;
            default:
                System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 3");
                break;
        }

//        String remainderByFourAsString;
//
//        if (remainderByFour == 0) {
//            remainderByFourAsString = "ZERO";
//        } else if (remainderByFour == 1) {
//            remainderByFourAsString = "ONE";
//        } else if (remainderByFour == 2) {
//            remainderByFourAsString = "TWO";
//        } else {
//            remainderByFourAsString = "THREE";
//        }

        String remainderByFourAsString = switch (remainderByFour) {
            case 0 -> {
                System.out.println("Dodatkowa instrukcja");
                //yield jest potrzebne aby zwrocic wartosc z wielolinijkowego bloku
                yield "ZERO";
            }
            case 1 -> "ONE";
            case 2 -> "TWO";
            //tu default jest obowiazkowe - kompilator musi miec gwarancje
            //ze pokrylismy wszystkie przypadki i wykona sie jakakolwiek galaz
            default -> "THREE";
        };

        System.out.println(remainderByFourAsString);
    }
}
