package eu.chrost.day4.s2abstract.lectures;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Maja");
        Cat cat = new Cat("Maniek");

        //nie da sie tworzyc instancji klasy abtrakcyjnej
        //Animal animal = new Animal();
        //ale mozna uzyc jej typu jako referencji do obiektu klasy dziedziczacej po niej
        Animal animal = dog;

        AnimalShelter animalShelter = new AnimalShelter();
        //metoda admit przyjmuje referencje do obiektu typu Animal
        //ale poniewaz i Dog i Cat dziedzicza po Animal
        //to moge je przekazac bezposrednio nawet bez rzutowania
        animalShelter.admit(dog);
        animalShelter.admit(cat);

        animalShelter.displayGreetings();
    }
}
