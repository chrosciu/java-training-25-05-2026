package eu.chrost.day4.s3sealed.lectures;

//klasa dziedziczaca po klasie zapieczetowanej moze byc finalna
public final class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Meow! I do not want do say anything but if you want... I'm " + name;
    }
}
