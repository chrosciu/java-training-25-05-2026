package eu.chrost.day4.s3sealed.lectures;

//klasa dziedziczaca po klasie zapieczetowanej tez moze byc zapieczetowana
public sealed class Bird extends Animal permits Canary {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Chirp! I'm " + name;
    }
}
