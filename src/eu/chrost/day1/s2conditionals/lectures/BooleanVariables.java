package eu.chrost.day1.s2conditionals.lectures;

import java.util.Random;

public class BooleanVariables {
    public static void main(String[] args) {
        boolean aTrue = true;
        boolean aFalse = false;

        System.out.println(aTrue);

        //operator NOT - odwraca wartosc logiczna
        boolean aNotTrue = !aTrue;
        System.out.println(aNotTrue);

        int i = new Random().nextInt(10);

        System.out.println("Wylosowana liczba to: " + i);

        boolean isEven = (i % 2 == 0);

        if (isEven) {
            System.out.println("Wylosowana liczba jest parzysta");
        }

        boolean isDivisibleByThree = (i % 3 == 0);

        if (isDivisibleByThree) {
            System.out.println("Wylosowania liczba jest podzielna przez 3");
        }

        //operator AND - wynik prawdziwy tylko wtedy gdy oba warunki sa prawdziwe
        boolean isDivisibleBySix = isEven && isDivisibleByThree;

        if (isDivisibleBySix) {
            System.out.println("Wylosowania liczba jest podzielna przez 6");
        }

        //operatorow mozna uzyc takze bez deklarowania zmiennych typu boolean
        isDivisibleBySix = (i % 2 == 0) && (i % 3 == 0);

        //mozna czegos takiego uzyc nawet bezposrednio w if
        if ((i % 2 == 0) && (i % 3 == 0)) {
            System.out.println("Wylosowania liczba jest podzielna przez 6");
        }

        //zadziala - ale to zbyt proste :P
        //boolean isNotDivisibleBySix = !isDivisibleBySix;

        //operator OR - wynik prawdziwy gdy co najmniej jeden z warunkow jest prawdziwy
        boolean isNotDivisibleBySix = !isEven || !isDivisibleByThree;

        if (isNotDivisibleBySix) {
            System.out.println("Wylosowania liczba nie jest podzielna przez 6");
        }

        //operator XOR - wynik prawdziwy gdy dokladnie jeden z warunkow jest prawdziwy
        boolean isDivisibleByTwoOrThree = isEven ^ isDivisibleByThree;
        if (isDivisibleByTwoOrThree) {
            System.out.println("Wylosowania liczba jest podzielna przez 2 lub 3 ale nie przez 6");
        }
    }
}
