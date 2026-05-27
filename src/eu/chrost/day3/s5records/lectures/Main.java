package eu.chrost.day3.s5records.lectures;

public class Main {
    public static void main(String[] args) {
        //rekord generuje nam z automatu konstruktor kanoniczny
        //(zawierajacy wszystkie pola po kolei)
        Point p1 = new Point(2.5, 3.5);

        //dostajemy tez od razu metode to string
        System.out.println(p1.toString());
        System.out.println(p1);

        //UWAGA: gettery nie trzymaja konwencji JavaBeans - bez prefixu get()
        System.out.println(p1.x());

        //otrzymujemy tez equals() i hashCode()
        Point p2 = new Point(2.5, 3.5);
        System.out.println(p1.equals(p2));
    }
}
