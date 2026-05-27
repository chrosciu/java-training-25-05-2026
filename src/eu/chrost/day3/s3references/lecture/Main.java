package eu.chrost.day3.s3references.lecture;

public class Main {
    public static void main(String[] args) {
        //typy primitywne - przypisanie kopiuje wartosc i tworzy nowe niezalezne miejsce w pamieci
        int x = 10;
        int y = x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //zmiana wartosci x nie wplywa na y
        x = 7;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //typy referencyjne - przypisanie kopiuje referencje (adres w pamieci) do obiektu
        Point p1 = new Point(3.5, 4.5);
        p1.print();

        //tworze zmienna typu obiektowego przez skopiowanie referencji do istniejacego obiektu
        Point p2 = p1;
        p2.print();

        //zmiana wartosci p2 wplywa na p1 poniewaz oba wskazuja na ten sam obiekt
        p2.setX(7.5);
        p1.print();
        p2.print();
    }
}
