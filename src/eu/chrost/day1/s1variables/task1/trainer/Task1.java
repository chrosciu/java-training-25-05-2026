package eu.chrost.day1.s1variables.task1.trainer;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj biezacy rok");
        String input = scanner.nextLine();
        int currentYear = Integer.parseInt(input);

        System.out.println("Podaj rok, w ktorym sie urodziles");
        input = scanner.nextLine();
        int yearOfBirth = Integer.parseInt(input);

        int age = currentYear - yearOfBirth;
        System.out.println("Twoj wiek to: " + age);
    }

}
