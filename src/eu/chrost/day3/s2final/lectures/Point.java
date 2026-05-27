package eu.chrost.day3.s2final.lectures;

public class Point {
    //pole typu final tez nie moze byc modyfikowane
    //poniewaz jednak pola w klasie maja domyslna wartosc (w przeciwienstwie do zmiennych w metodach)
    //to oznacza ze w tym przypadku wartosc takiego pola musi byc ustawiona:
    //- albo w momencie deklaracji
    //- albo w konstruktorze
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
