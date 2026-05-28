package eu.chrost.day4.s4interfaces.lectures.animals;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
}
