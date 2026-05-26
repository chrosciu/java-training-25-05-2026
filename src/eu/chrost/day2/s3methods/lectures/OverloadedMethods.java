package eu.chrost.day2.s3methods.lectures;

public class OverloadedMethods {
    public static void main(String[] args) {
        System.out.println(incrementValue(5, 7));
        System.out.println(incrementValue(6));
    }

    public static int incrementValue(int value, int amount) {
        return value + amount;
    }

    //czesto stosowany wzorzec - metoda o tej samej nazwie ale z innymi argumentami
    //czesto jest tak ze deleguje ona swoje dzialanie do oryginalnej metody
    //pozwalajac na tzw. argumenty domyslne
    public static int incrementValue(int value) {
        //return value + 1;
        return incrementValue(value, 1);
    }

    //nie kompiluje sie - druga metoda o takiej samej nazwie i takim samym zestawie argumentow
//    public static long incrementValue(int value2) {
//        return value2 + 1;
//    }

    //zadziala ale jest ryzykowne bo teoretycznie int jest longiem
    //i mozna sie zastanawiac ktora z metod zostanie zawolana
    public static long incrementValue(long value) {
        return value + 1;
    }
}
