package eu.chrost.day3.s2final.lectures;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        x = 7;
        System.out.println(x);

        //do zmiennej oznaczonej modyfikatorem final wartosc mozna przypisac tylko raz
        final int y;
        y = 6;
        System.out.println(y);

        //drugie przypisanie konczy sie bledem kompilacji
        //y = 7;

        ImmutablePoint immutablePoint = new ImmutablePoint(2.5, 3.5);
        System.out.println(immutablePoint.asString());
        ImmutablePoint shifted = immutablePoint.shift(1, 2);
        System.out.println(shifted.asString());
    }
}
