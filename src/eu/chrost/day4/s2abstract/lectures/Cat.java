package eu.chrost.day4.s2abstract.lectures;

//po klasie zadeklarowanej jako final nie da sie juz dziedziczyc
public final class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Meow! I do not want do say anything but if you want... I'm " + name;
    }
}
