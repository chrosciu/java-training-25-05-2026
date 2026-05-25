package eu.chrost.day1.s1variables.lectures;

public class CharVariables {
    public static void main(String[] args) {
        //typ char jest teoretycznie typem calkowitym, ale zostal zdeklarowany po to aby trzymac w nim znaki ASCII/Unicode
        char c = 100;
        //dlatego tez przy wypisywaniu go na ekran nie otrzymamy 100 tylko `d` - znak o kodzie ASCII 100
        System.out.println(c);
        //dodanie do siebie dwoch wartosci nawet typu char i tak daje int - wiec trzeba scastowac caly wynik
        char d = (char) (c + 1);
    }
}
