package eu.chrost.day4.s4interfaces.lectures;

import eu.chrost.day4.s4interfaces.lectures.animals.Dog;
import eu.chrost.day4.s4interfaces.lectures.cars.Car;
import eu.chrost.day4.s4interfaces.lectures.greeter.Greeter;
import eu.chrost.day4.s4interfaces.lectures.names.ExtraNameable;
import eu.chrost.day4.s4interfaces.lectures.names.Nameable;
import eu.chrost.day4.s4interfaces.lectures.names.NameableComparator;
import eu.chrost.day4.s4interfaces.lectures.people.Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        //do tej metody mozemy przekazac obiekt typu Dog bez zadnego rzutowania
        //gdyz implementuje on interfejs Nameable
        Greeter.greet(dog);
        Employee employee = new Employee(2000, "Alice", "Johnson");
        Greeter.greet(employee);

        Car car = new Car("Fiat", "Punto");

        //z rzutowaniem jest podobnie jak w przypadku klasy bazowej
        Nameable hiddenDog = dog;
        Dog revealedDog = (Dog)hiddenDog;

        //rowniez instanceof dziala analogicznie
        if (hiddenDog instanceof Dog) {
            System.out.println("This is a dog!");
        }

        greetExtra(employee);

        Dog anotherDog = new Dog("Max", 5);
        Dog thirdDog = new Dog("Charlie", 2);

        Dog[] dogs = {anotherDog, dog, thirdDog};
        //tablica inicjalnie nie jest posortowana
        System.out.println(Arrays.toString(dogs));

        //do sortowania potrzebny nam bedzie komparator ktory sobie wczesniej przygotowalismy
        //oraz metoda sort() z klasy Arrays
        //uwaga: modyfikuje ona wejsciowa tablice (a nie zwraca nowa posortowana jakby sie mozna spodziewac)
        //to dziala dlatego ze Java jest w stanie wykryc ze elementy tablicy Dogs implementuja Nameable
        //wiec mozna uzyc dostarczonego komparatora
        Arrays.sort(dogs, new NameableComparator());
        System.out.println(Arrays.toString(dogs));

        Employee anotherEmployee = new Employee(3000, "Alice", "Johnson");
        Employee yetAnotherEmployee = new Employee(1000, "Jane", "Smith");

        Employee[] employees = {employee, anotherEmployee, yetAnotherEmployee};
        System.out.println(Arrays.toString(employees));

        //poniewaz Employee implementuje interfejs Comparable to przy sortowaniu nie trzeba podawac komparatora
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));

    }

    private static void greetExtra(ExtraNameable extraNameable) {
        System.out.println("Hello, " + extraNameable.getFullName());
    }
}
