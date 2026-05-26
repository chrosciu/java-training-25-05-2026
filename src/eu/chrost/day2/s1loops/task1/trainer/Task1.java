package eu.chrost.day2.s1loops.task1.trainer;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");

        String input = scanner.nextLine();
        int n = Integer.parseInt(input);
        int currentNumber = 1;
        int sum = 0;

        while(currentNumber <= n) {
            sum += currentNumber++;
        }

        System.out.println("Suma: " + sum);
    }
}
