package eu.chrost.day3.s6static.lectures;

public class Main {
    public static void main(String[] args) {
        //counter ?
        //statyczna metode mozna zawolac uzywajac nazwy klasy
        //a nie referencji do obiektu
        System.out.println(Point.getCounter());
        Point p1 = new Point(2.5, 3.5);
        //zadziala ale jest niezalecane
        System.out.println(p1.getCounter());
        //tak jest poprawnie
        System.out.println(Point.getCounter());
        Point p2 = new Point(3, 4);
        System.out.println(Point.getCounter());

        System.out.println(Point.CLASS_NAME);

        //nie kompiluje sie - konstruktor jest prywatny
        //Weather weather = new Weather();

        Weather weather = Weather.getInstance();
        System.out.println("Current temperature: " + weather.getTemperature());

        Weather anotherWeather = Weather.getInstance();
        System.out.println("Are both weather instances the same? " + (weather == anotherWeather));

    }
}
