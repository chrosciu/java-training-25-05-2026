package eu.chrost.day4.s4interfaces.lectures.names;

import eu.chrost.day4.s4interfaces.lectures.animals.Animal;
import eu.chrost.day4.s4interfaces.lectures.cars.Car;
import eu.chrost.day4.s4interfaces.lectures.people.Employee;

//interfejs jest zestawem metod -
//- kontraktem jaki zobowiazuje sie zaimplementowac klasa
//jezeli deklaruje ze implementuje dany interfejs
public interface Nameable {
    //metody w interfejsach domyslnie sa publiczne i abstrakcyjne
    //i te modyfikatory mozna spokojnie pominac
    String getName();
}
