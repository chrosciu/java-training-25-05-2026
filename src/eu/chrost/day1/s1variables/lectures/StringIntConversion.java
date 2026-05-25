package eu.chrost.day1.s1variables.lectures;

public class StringIntConversion {
    public static void main(String[] args) {
        int i = 3;
        //na pewno nie da sie nie wprost (int -> String) - to sa dwa rozne typy
        //String iAsString = i;
        //wprost tez sie nie da - jedno to typ primitywny drugie obiektowy
        //String iAsString = (String) i;
        //jedyny sposob to uzycie metody toString w klasie Integer (badz tez innej odpowiadajacej danemu typowi)
        String iAsString = Integer.toString(i);
        System.out.println(iAsString);

        String s = "4";
        //ani wprost (String -> int) ani nie wprost sie nie da
        //int sAsInt = (int) s;
        //nalezy uzyc metody parseInt w klasie Integer (badz tez innej odpowiadajacej danemu typowi)
        int sAsInt = Integer.parseInt(s);
        System.out.println(sAsInt);

        String notANumber = "a";
        //to sie kompiluje ale wyrzuci wyjatek podczas wykonywania programu
        int notANumberAsInt = Integer.parseInt(notANumber);
        System.out.println(notANumberAsInt);
    }
}
