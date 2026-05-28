package eu.chrost.day4.s3sealed.lectures;

//jesli klasa dziedziczy po klasie zapieczetowanej
//a sama dopuszcza dziedziczenie po sobie
//to musi byc wprost oznaczona jako non-sealed
non-sealed class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Woof! My name is: " + name;
    }

    public String fetch() {
        return name + " is fetching the ball!";
    }
}
