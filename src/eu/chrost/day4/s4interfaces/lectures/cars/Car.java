package eu.chrost.day4.s4interfaces.lectures.cars;

import eu.chrost.day4.s4interfaces.lectures.names.Nameable;

//rekordy maja ograniczone mozliwosci udzialu w hierarchii dziedziczenia
//rekord nie moze dziedziczyc po zadnej klasie
//ani tez zadna klasa nie moze dziedziczyc po rekordzie
//natomiast rekord moze implementowac interfejs lub interfejsy
public record Car(String brand, String model) implements Nameable {
    @Override
    public String getName() {
        return brand + " " + model;
    }
}
