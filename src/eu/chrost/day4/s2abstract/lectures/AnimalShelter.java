package eu.chrost.day4.s2abstract.lectures;

public class AnimalShelter {
    private Animal[] animals = new Animal[0];

    //dzieki temu ze Cat i Dog maja tego wspolnego przodka Animal
    //moge go tutaj uzyc i jestem dzieki temu w stanie przyjac tutaj
    //dowolne zwierze (nawet jesli w przyszlosci pojawi sie nowy typ)
    public void admit(Animal animal) {
        Animal[] newAnimals = new Animal[animals.length + 1];
        for (int i = 0; i < animals.length; ++i) {
            newAnimals[i] = animals[i];
        }
        newAnimals[animals.length] = animal;
        animals = newAnimals;
    }

    //dzieki klasie abstrakcyjnej Animal
    //klasa AnimalShelter w ogole nie musi wiedziec
    //ze istnieje cos takiego jak Dog i Cat
    public void displayGreetings() {
        for (Animal animal : animals) {
            System.out.println(animal.greet());
        }
    }
}
