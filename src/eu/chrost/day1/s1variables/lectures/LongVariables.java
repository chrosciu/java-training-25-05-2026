package eu.chrost.day1.s1variables.lectures;

public class LongVariables {
    public static void main(String[] args) {
        int bigA = 1000000;
        //to samo co bigA ale w zapisie z grupowaniem
        int bigB = 1_000_000;

        int bigProduct = bigA * bigB;
        //przekroczenie zakresu int - wychodza jakies ujemne smieci
        System.out.println(bigProduct);

        long longBigProduct = bigA * bigB;
        System.out.println(longBigProduct);

        long longA = 1000000;
        long longBigProduct2 = longA * bigB;
        System.out.println(longBigProduct2);

        //mozna zawsze przypisac z mniejszego typu do wiekszego
        long longCastedA = bigA;
        long longBigProduct3 = longCastedA * bigB;
        System.out.println(longBigProduct3);

        //przypisanie z rzutowaniem wprost - poprawne, ale w tym przypadku zbedne
        long explicitlyCastedA = (long) bigA;
        long longBigProduct4 = explicitlyCastedA * bigB;
        System.out.println(longBigProduct4);

        //rzutowanie tylko w celu wykonania operacji - aby nie tworzyc niepotrzebnej posredniej zmiennej
        long longBigProduct5 = (long) bigA * bigB;
        System.out.println(longBigProduct5);
    }
}
