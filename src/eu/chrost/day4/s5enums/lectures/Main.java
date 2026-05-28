package eu.chrost.day4.s5enums.lectures;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //mozna sobie pobrac tablice wszystkich wartosci enuma
        WeekDay[] weekDays = WeekDay.values();
        //dodatkowo widac ze klasa enuma implementuje niejawnie metode toString()
        System.out.println(Arrays.toString(weekDays));

        //enuma nie tworzymy tylko po prostu pobieramy jego wartosc
        WeekDay today = WeekDay.THURSDAY;
        //dla kazdego enuma jest zdefiniowana metoda name() - zwracajaca nazwe
        System.out.println(today.name());
        //oraz metoda ordinal - zwracajaca kolejny indeks (liczony od 0)
        //enuma na liscie deklaracji w klasie
        System.out.println(today.ordinal());

        //i tu mozna zawolac metode na enumie
        System.out.println("Is " + today + " a weekend? " + today.isWeekend());
        System.out.println("Is " + today + " a weekend? " + isWeekend(today));

        //enuma mozna takze odtworzyc na podstawie lancucha tekstowego ktory go reprezentuje
        WeekDay monday = WeekDay.valueOf("MONDAY");
        System.out.println(monday);


        //jesli podamy lancuch nieodpowiadajacy enumowi to dostaniemy w runtime IllegalArgumentException
        //WeekDay unknown = WeekDay.valueOf("unknown");
    }

    private static boolean isWeekend(WeekDay day) {
        //poniewaz enumy nie sa tworzone przez programiste tylko przez Jave i sa wspoldzielone
        //to mozna to ich porownania bez problemu uzyc operatora ==
        return day == WeekDay.SATURDAY || day == WeekDay.SUNDAY;
    }
}
