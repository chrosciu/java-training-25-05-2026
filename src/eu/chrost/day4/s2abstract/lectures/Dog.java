package eu.chrost.day4.s2abstract.lectures;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    //oznaczajac metode jako final
    //uniemozliwiamy jej nadpisanie w klasie potomnej
    @Override
    public final String greet() {
        return "Woof! My name is: " + name;
    }
}
