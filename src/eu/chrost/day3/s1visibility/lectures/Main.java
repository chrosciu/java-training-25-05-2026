package eu.chrost.day3.s1visibility.lectures;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2.5, 3.5);

        // to sie nie kompiluje - trzeba uzyc gettera
        //System.out.println(p1.x);
        System.out.println(p1.getX());

        //to sie nie kompiluje - musimy uzyc settera
        //p1.x = 4;
        p1.setX(4);

        //System.out.println(p1.x);
        System.out.println(p1.getX());

        p1.print();
    }
}
