package eu.chrost.day2.s3methods.lectures;

public class VarArgsMethods {
    public static void main(String[] args) {
        System.out.println(sum(1, 4, 7));
        System.out.println(sum(2));
        System.out.println(sum());
        System.out.println(sumWithPrefix("Sum is: ", 2, 3, 5));
    }

    //uzywajac zapisu z `...` mozna wskazac ze ostatni argument metody
    //moze byc uzyty dowolna ilosc razy w zawolaniu
    //i takie argumenty o nieznanej ich liczbie
    //sa dostepne w postaci pseudotablicy w ciele metody
    public static int sum(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    //argument typu varargs musi byc ostatnim argumentem w deklaracji metody
    public static String sumWithPrefix(String prefix, int... values) {
        int sum = sum(values);
        return prefix + sum;
    }
}
