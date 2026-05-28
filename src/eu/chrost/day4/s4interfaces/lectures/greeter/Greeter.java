package eu.chrost.day4.s4interfaces.lectures.greeter;

import eu.chrost.day4.s4interfaces.lectures.names.Nameable;

//skoro mamy interfejs Nameable to mozemy go po prostu przekazac jako argument metody
//i nie zastanawiac sie w ogole co pod spodem go implementuje
public class Greeter {
    public static void greet(Nameable nameable) {
        System.out.println("Hello, " + nameable.getName());
    }
}
