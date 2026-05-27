package eu.chrost.day3.s2final.lectures;

//klasa niemutowalna - pozwala na to zeby raz ustawic stan
// i potem tylko go odcztywac bez mozliwosci modyfikacji
public class ImmutablePoint {
    //wszystkie pola musza byc typu private final
    //typy tych pol musza byc albo typami primitywnymi
    //albo tez musza byc typu klasy niemutowalnej (np. String)
    private final double x;
    private final double y;

    //to oznacza ze stan tej klasy musi byc ustawiony w konstruktorze
    //(ew. na poziomie samych pol - ale to rzadkosc)
    //po zawolaniu konstruktora stan klasy zostaje zablokowany
    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //poniewaz pola sa prywatne to niezbedne sa gettery
    //(choc niekoniecznie wszystkie - zalezy czy ktos bedzie chcial dostawac sie do pol)
    public double getX() {
        return x;
    }

    //jezeli typ pola klasy nie jest typem niemutowalnym - np. jakas kolekcja / tablica
    //to wtedy getter powinien zwracac kopie tego pola a nie jego oryginalna wartosc
    public double getY() {
        return y;
    }

    //jezeli jakas metoda ma modyfikowac stan obiektu
    //to powinna zostawic oryginalny obiekt bez zmian
    //a zamiast tego zwrocic zmodyfikowana kopie
    public ImmutablePoint shift(double x, double y) {
        return new ImmutablePoint(this.x + x, this.y + y);
    }

    //dobra praktyka jest przygotowanie metody zwracajacej tekstowy stan obiektu
    public String asString() {
        return "ImmutablePoint(" + x  + "," + y + ")";
    }
}
