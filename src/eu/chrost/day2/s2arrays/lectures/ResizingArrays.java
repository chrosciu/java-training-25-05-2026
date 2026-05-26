package eu.chrost.day2.s2arrays.lectures;

import java.util.Arrays;

public class ResizingArrays {
    public static void main(String[] args) {
        //pierwotna tablica
        int[] intArray = {3, 4, 7};

        //dodajemy nowy element do tablicy
        int newElement = 9;

        //tworzymy nowa tablice o 1 wieksza
        int[] extendedArray = new int[intArray.length + 1];

        //kopiujemy elementy ze starej tablicy do nowej
        for (int i = 0; i < intArray.length; i++) {
            extendedArray[i] = intArray[i];
        }

        //alternatywa jest uzycie metody System.arraycopy
        //dziala to dokladnie tak samo jak poprzedni for
        System.arraycopy(intArray, 0, extendedArray, 0, intArray.length);
        //stara tablica, indeks startowy w starej tablicy, nowa tablica, indeks startowy w nowej tablicy, liczba kopiowanych elementow

        //dodajemy nowy element na koniec nowej tablicy
        extendedArray[intArray.length] = newElement;

        //wyswietlamy nowa tablice
        System.out.println(Arrays.toString(extendedArray));
    }
}
