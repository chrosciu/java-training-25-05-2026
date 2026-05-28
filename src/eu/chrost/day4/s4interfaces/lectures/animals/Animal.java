package eu.chrost.day4.s4interfaces.lectures.animals;

import eu.chrost.day4.s4interfaces.lectures.names.Nameable;

//klasa Animal implementuje interfejs Nameable
//dlatego tez musi miec zaimplementowana metode getName
public abstract class Animal implements Nameable {
    private final String name;
    private final int age;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
