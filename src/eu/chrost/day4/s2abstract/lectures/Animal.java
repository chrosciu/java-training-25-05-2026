package eu.chrost.day4.s2abstract.lectures;

//klasa abstrakcyjna jest klasa, ktorej instancji nie mozna utworzyc
//natomiast mozna uzywac bezproblemowo referencji do tej klasy
public abstract class Animal {
    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    //w klasie abstrakcyjnej mozna definiowac metody abstrakcyjne
    //(oczywiscie mozna takze robic metody zwykle)
    //metoda abstrakcyjna nie ma i nie moze miec implementacji
    //natomiast musi zostac zaimplementowana w klasach potomnych
    public abstract String greet();
}
