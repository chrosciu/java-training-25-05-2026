package eu.chrost.day4.s3sealed.lectures;

public final class Canary extends Bird {
    public Canary(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Tweet! I'm a canary and my name is " + name;
    }
}
