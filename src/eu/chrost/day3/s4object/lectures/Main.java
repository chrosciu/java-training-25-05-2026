package eu.chrost.day3.s4object.lectures;


public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3.5, 4.5);
        System.out.println(p1.toString());
        //println pod spodem sam zawola sobie toString() wiec nie trzeba tego nawet wolac
        System.out.println(p1);

        int x = 3;
        int y = 3;
        int z = 4;

        System.out.println("x == y -> " + (x == y));
        System.out.println("x == z -> " + (x == z));

        Point p2 = new Point(3.5, 4.5);
        //operator == w przypadku zmiennych typu obiektowego
        //porownuje adresy w pamieci - zwroci true tylko wtedy
        //jesli obie wskazuja na ten sam obiekt
        System.out.println("p1 == p2 -> " + (p1 == p2));

        Point p3 = p2;
        System.out.println("p2 == p3 -> " + (p2 == p3));

        //equals tez tu nie pomaga - domyslnie dziala tak samo jak ==
        //chyba ze go nadpiszemy
        System.out.println("p1.equals(p2) -> " + (p1.equals(p2)));

        Point p4 = new Point(1.0, 2.0);
        System.out.println("p1.equals(p4) -> " + (p1.equals(p4)));
    }
}
