package eu.chrost.day2.s3methods.lectures;

import java.util.Arrays;

public class Methods {
    //metoda main nie zwraca wartosci - co deklarujemy za pomoca pseudotypu void
    //oznacza to ze nie musimy wstawiac w niej instrukcji return
    //ale nie jest to zabronione
    public static void main(String[] args) {
        int[] intArray = {3, 4, 7};
        int newElement = 9;

        //tutaj zawolamy nasza metode - uzyjemy skladni `()` i przypisujemy wynik do zmiennej
        //przypisanie wyniku jest opcjonalne - mozna zawolac metode i zignorowac jej wynik
        int[] extendedArray = appendToArray(intArray, newElement);
        System.out.println(Arrays.toString(extendedArray));

        int anotherNewElement = 12;
        //ponownie uzywamy metody - napisalismy kod i raz i go reuzywamy
        int[] furtherExtendedArray = appendToArray(extendedArray, anotherNewElement);
        System.out.println(Arrays.toString(furtherExtendedArray));
    }

    //tworzac nowa metode musimy podac jej nazwe, typ zwracanej wartosci oraz typy argumentow jakie mozna do niej przekazac
    //na te chwile nasze wszystkie metody beda mialy modyfikator `public static`
    //wszystko to tworzy tzw. sygnature metody
    public static int[] appendToArray(int[] existingArray, int elementToAppend) {
        if (existingArray.length == 0) {
            //metoda moze miec wiecej niz jeden punkt wyjscia
            //oczywiscie tutaj tez trzeba zwrocic tablice jako wynik
            return new int[]{elementToAppend};
        }

        int[] newArray = new int[existingArray.length + 1];
        for (int i = 0; i < existingArray.length; ++i) {
            newArray[i] = existingArray[i];
        }
        newArray[existingArray.length] = elementToAppend;
        //zwracanie wartosci z metody odbywa sie poprzez instrukcje return
        //jest ona wymagana jezeli deklarujemy ze metoda ma zwracac jakakolwiek wartosc
        return newArray;
    }
}
