package eu.chrost.day3.s6static.lectures;

import java.util.Random;

public class Weather {
    private static Weather instance = new Weather();

    private final int temperature;

    public static Weather getInstance() {
        return instance;
    }

    public int getTemperature() {
        return temperature;
    }

    //odcinamy mozliwosc zawolania konstruktora spoza klasy
    private Weather() {
        temperature = new Random().nextInt(100);
    }
}
