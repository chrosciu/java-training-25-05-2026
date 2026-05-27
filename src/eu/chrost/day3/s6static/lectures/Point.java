package eu.chrost.day3.s6static.lectures;

public class Point {
    private final double x;
    private final double y;

    //stale publiczne rowniez powinny byc typu static
    //dodatkowo obowiazuje w nich konwencja UPPER_KEBAB_CASE
    public static final String CLASS_NAME = "Point";

    //slowo static oznacza iz dane pole albo metoda
    //nie jest powiazane z konkretna instancja obiektu danej klasy
    //tylko z klasa jako taka
    //dzieki temu mozna miec dostep do czegos takiego
    //zanim zostanie w ogole utworzony obiekt danej klasy
    private static int counter = 0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        counter++;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    //ta metoda tez powinna byc statyczna bo nie uzywa niczego
    //co jest powiazane z konkretna instancja obiektu
    public static int getCounter() {
        //nie da sie z metody statycznej dostac do pol i metod niestatycznych
        //gdyz nie jestesmy w kontekscie zadnego obiektu
        //System.out.println(x);

        //this nie dziala z tego samego powodu
        //System.out.println(this);

        //w druga strone dziala to bez problemu
        //do pol i metod statycznych mozna dostac sie z kazdego miejsca w klasie

        return counter;
    }
}
