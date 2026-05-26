package eu.chrost.day2.s2arrays.lectures;

public class ForEach {
    public static void main(String[] args) {
        int[] predefinedArray = {3, 4, 7};

        //petla for-each sluzaca do iteracji po tablicach, kolekcjach etc.
        //deklarujemy w niej zmienna odpowiadajaca pojedynczemu elementowi
        //a nastepnie po dwukropku wskazujemy tablice / kolekcje podlegajaca iteracji
        //WADA: nie mamy dostepu do indeksu
        for (int element : predefinedArray) {
            System.out.println(element);
        }
    }
}
