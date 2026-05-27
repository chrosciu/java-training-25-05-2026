package eu.chrost.day3.s4object.lectures;

import java.util.Objects;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(toString());
    }

    //jezeli chcemy miec metode zwracajaca tekstowa reprezentacje obiektu
    //to najlepiej napisac wlasna wersje metody toString()
    //pochodzacej z klasy Object
    //nie trzeba tego pisac recznie - IntelliJ potrafi to wygenerowac
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
