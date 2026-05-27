package eu.chrost.day2.s4classes.lectures;

public class Main {
    public static void main(String[] args) {
        //aby dalo sie uzywac obiektu klasy Point trzeba go sobie stworzyc - poprzez operator `new`
        Point p1 = new Point();

        //od razu mozemy zaczac uzywac stworzonego obiektu
        //mozemy zawolac metody zdefiniowane w klasie obiektu za pomoca operatora `.`
        p1.print();

        //mozemy modyfikowac wlasciwosci obiektu tez za pomoca operatora `.`
        p1.x = 3.5;
        p1.y = 4.5;
        p1.print();

        p1.shift(-1, 1.5);
        p1.print();

        //wlasnosci mozna takze odczytywac
        System.out.println(p1.x);
        System.out.println(p1.y);

        //tworzymy nowy punkt uzywajac konstruktora z argumentami
        Point p2 = new Point(3.0, 4.0);
        p2.print();

        System.out.println(p2.distanceFromZero());
    }
}
