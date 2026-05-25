package eu.chrost.day1.s1variables.lectures;

public class FloatingVariables {
    public static void main(String[] args) {
        double d = 0.5;
        System.out.println(d);

        //blad kompilacji - utrata wartosci
        //int i = 0.5;

        //skompiluje sie ale jest bez senu - wyjdzie po prostu 0
        int i = (int)0.5;

        double a = 1;
        double b = 3;
        double quotient = a / b;
        System.out.println(quotient);

        int intA = 1;
        int intB = 3;
        //wynik bedzie double ale rowne zeru - gdyz najpierw zostanie obliczony iloraz typu int
        //a dopiero potem nastapi konwersja na double
        double quotientOfInt = intA / intB;
        System.out.println(quotientOfInt);

        //aby wynik faktycznie byl obliczony jako double to przynajmniej jeden z operandow
        //tez musi byc double
        double quotientOfConvertedInt = intA / (double)intB;
        System.out.println(quotientOfConvertedInt);

        //wartosci (literaly 1 oraz 3) sa traktowane domyslnie jako int - problem jak wyzje
        double quotientOfLiterals = 1 / 3;
        System.out.println(quotientOfLiterals);

        //aby potraktowac literal jako double trzeba albo podac czesc zmiennoprzecinkowa
        //chocby i rowna 0
        quotientOfLiterals = 1 / 3.0;
        System.out.println(quotientOfLiterals);

        //albo tez uzyc sufiksu `d` - zadziala jak wyzej
        quotientOfLiterals = 1 / 3d;
        System.out.println(quotientOfLiterals);


    }
}
