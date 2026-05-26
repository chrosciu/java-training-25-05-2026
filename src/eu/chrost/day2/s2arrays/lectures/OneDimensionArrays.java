package eu.chrost.day2.s2arrays.lectures;

import java.util.Arrays;

public class OneDimensionArrays {
    public static void main(String[] args) {
        //zmienna typu tablicowego - najlepiej od razu ja zainicjalizowac i podac rozmiar
        int[] intArray = new int[5];
        //po zainicjalizowaniu w komorkach tablicy znajduja sie domyslne wartosci - dla typu int sa to zera

        //element z tablicy modyfikujemy i odczytujemy za pomoca operatora indeksu `[]`)
        intArray[2] = 1;

        //po tablicy iterujemy za pomoca indeksow
        //zaczynamy zawsze od 0 do (length - 1)
        //dlugosc tablicy mozna odczytac za pomoca property length
        //dostep do property mamy za pomoca operatora `.`
        for (int i = 0; i < intArray.length; ++i) {
            System.out.println("intArray[" + i + "] -> " + intArray[i]);
        }

        //WAZNE: nie nalezy wyjezdzac poza zakres tablicy !!!
        //kod sie skompiluje ale wyrzuci wyjatek w runtime
        //intArray[6] = 1;

        //tablica o z gory zdefiniowanych elementach - bedzie miala dlugosc 3
        //jest to odpowiednik zapisu
        /*
        int[] predefinedArray = new int[3];
        predefinedArray[0] = 3
        predefinedArray[1] = 4
        predefinedArray[2] = 7
        */
        int[] predefinedArray = {3, 4, 7};

        for (int i = 0; i < predefinedArray.length; i++) {
            System.out.println("predefinedArray[" + i + "] -> " + predefinedArray[i]);
        }

        //predefiniowana tablice tez mozna modyfikowac
        predefinedArray[1] = 6;

        for (int i = 0; i < predefinedArray.length; i++) {
            System.out.println("predefinedArray[" + i + "] -> " + predefinedArray[i]);
        }

        //zadziala ale wygeneruje kompletnie nieczytelny napis
        System.out.println(predefinedArray);

        //mozna skorzystac z gotowej metody w klasie Arrays
        System.out.println(Arrays.toString(predefinedArray));



    }
}
