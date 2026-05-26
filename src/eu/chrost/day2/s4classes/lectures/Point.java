package eu.chrost.day2.s4classes.lectures;

//Klasa Point reprezentuje punkt na plaszczyznie
//zawiera w sobie niezbedne wlasciwosci opisujace punkt (polozenie)
//a takze metody pozwalajace na wyciaganie danych i manipulacje nimi
public class Point {
    //pola / wlasciwosci - opisuja stan obiektu
    //jezeli pola nie sa zainicjalizowane to przyjmuja wartosci domyslne
    //dla typow liczbowych - 0
    //dla typu boolean - false
    //dla typow obiektowych - null
    public double x;
    public double y;

    //podczas tworzenia obiektu wolana jest zawsze specjalna funkcja
    //do jego inicjalizacji - nazywana konstruktorem
    //jezeli takiej funkcji nie napiszemy to Java utworzy ja za nas
    //i taka domyslnie stworzona funkcja nie przyjmuje zadnych parametrow

    //konstruktor wyglada jak zwykla metoda ale rozni sie tym ze:
    //- nie podajemy w nim zwracanego typu
    //- jego nazwa jest taka jak nazwa klasy

    //konstruktor bezparametrowy
    //domyslnie generowany przez kompilator - o ile nie zdefiniowalismy innego konstruktora
    public Point() {
        //dobra praktyka jest delegowanie dzialania do bardziej rozbudowanego konstruktora
        //jezeli tak robimy to takie zawolanie musi byc pierwsza instrukcja w konstruktorze
        //do innego konstruktora odwolujemy sie przez slowo kluczowe this
        this(0.0, 0.0);
    }

    //konstruktorow moze byc wiecej niz 1 - mozna je tak samo przeladowywac jak metody
    //ten konstruktor pozwala na ustawienie od razu wlasnosci x i y
    public Point(double x, double y) {
        //pniewaz argumenty x i y nazywaja sie tak samo jak pola klasy
        //to w efekcie je zaslaniaja
        //i zapis x=x powoduje ze przypisujemy wartosc x do samego siebie
        //nie ustawiajac de facto wartosci na polu klasy
        //aby obejsc ten problem musimy uzyc znowu slowa klucozwego this
        //ktore to slowo wprost odwoluje sie do obiektu w kontekscie ktorego pracujemy
        this.x = x;
        this.y = y;
    }

    //funkcja / metoda pozwalajaca zmienic stan obiektu
    public void shift(double xShift, double yShift) {
        //tutaj slowo this nie jest konieczne - nie ma bowiem zaslaniania argumentow
        //ale jego dodanie tez niczego nie zepsuje
        this.x += xShift;
        this.y += yShift;
    }

    //funkcja / metoda odczytujaca / prezentujaca stan obiektu
    public void print() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}
