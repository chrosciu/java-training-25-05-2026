package eu.chrost.day3.s1visibility.lectures;

public class Point {
    //do pola / metody typu public mozna dostac sie z kazdego miejsca w programie
//    public double x;
//    public double y;

    //jest to tzw. widocznosc domyslna / pakietowa - mozna dostac sie tutaj tylko z miejsca w tym samyym pakiecie
//    double x;
//    double y;

    //do pola / metody typu private mozna dostac sie tylko z wnetrza tej samej klasy
    private double x;
    private double y;

    //konstruktor moze byc publiczny - chyba ze chcemy uniemozliwic tworzenie instancji danej klasy
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //metody dostepowe do pol prywatnych - moga byc publiczne, odczyt nic nie psuje
    //powinny trzymac sie konwencji getNazwaPola(), nie powinny przyjmowac argumentow
    //i powinny zwracac taki sam typ jak pole - konwencja Java Beans
    //wyjatek - pola typu boolean moga miec getter o nazwie isNazwaPola()
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //setter - tu akurat zrobilem pakietowy, ale to jest kwestia do ustalenia jakie sa wymagania
    //powinien sie nazywac setNazwaPola(), nie zwracac wartosci i przyjmowac argument takiego typu jak
    //dane pole - konwencja JavaBeans
    void setX(double x) {
        this.x = x;
    }

    //wypisywanie zawartosci - mozna przyjac ze jest to czesc publicznego API danej klasy
    //dlatego jest publiczna
    //natomiast wewnatrz korzysta z prywatnej metody
    public void print() {
        System.out.println(getRepresentation());
    }

    //prywatne metody klasy to zwykle metody pomocnicze - nie chcemy zeby ktos wolal je bezposrednio
    private String getRepresentation() {
        return "Point(" + x  + "," + y + ")";
    }
}
