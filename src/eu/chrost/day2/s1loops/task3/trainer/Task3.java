package eu.chrost.day2.s1loops.task3.trainer;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);
        long silnia = 1;

        for (int i = 1 ; i <= n ; i++) {
            silnia = silnia * i;
        }
        System.out.println("Silnia: " + silnia);
    }
}
