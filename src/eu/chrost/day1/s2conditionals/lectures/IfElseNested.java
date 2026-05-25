package eu.chrost.day1.s2conditionals.lectures;

import java.util.Random;

public class IfElseNested {
    public static void main(String[] args) {
        int i = new Random().nextInt(10);

        System.out.println("Wylosowana liczba to: " + i);

        int remainderByThree = i % 3;

        if (remainderByThree == 0) {
            System.out.println("Wylosowana liczba jest podzielna przez 3");
        } else {
            if (remainderByThree == 1) {
                System.out.println("Wylosowana liczba przy dzieleniu przez 3 daje reszte 1");
            } else {
                System.out.println("Wylosowana liczba przy dzieleniu przez 3 daje reszte 2");
            }
        }

        //to samo co powyżej ale zapisane w formie else-if
        //czyli wyliczamy po kolei if-y - pierwszy ktory bedzie spelniony wykonany przypisany mu blok
        if (remainderByThree == 0) {
            System.out.println("Wylosowana liczba jest podzielna przez 3");
        } else if (remainderByThree == 1) {
            System.out.println("Wylosowana liczba przy dzieleniu przez 3 daje reszte 1");
        } else {
            System.out.println("Wylosowana liczba przy dzieleniu przez 3 daje reszte 2");
        }

        //operator "nie rowna sie"
        if (i % 2 != 0) {
            System.out.println("Wylosowana liczba jest nieparzysta");
        }
    }
}
