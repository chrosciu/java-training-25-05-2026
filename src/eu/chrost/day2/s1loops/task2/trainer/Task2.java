package eu.chrost.day2.s1loops.task2.trainer;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");

        String input = scanner.nextLine();
        int n = Integer.parseInt(input);
        int sum = 0;

        for (int i = 1; i <= n; i++) {
           sum += i;
        }
        System.out.println("Suma: " + sum);
    }
}
