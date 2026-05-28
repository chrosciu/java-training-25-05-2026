package eu.chrost.day4.s3sealed.lectures;

public class Dachshund extends Dog {
    public Dachshund(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Woof! I'm a dachshund and my name is " + name;
    }
}
