package eu.chrost.day2.s1loops.lectures;

public class NestedLoops {
    public static void main(String[] args) {
        //wypisz pary liczb (x, y) gdzie x i y sa w zakresie 1 - 3
        int x = 1;
        //petla zewnetrzna
        while (x <= 3) {
            //kazdy blok instrukcji oznaczony nawiasami {...}
            //definiuje tzw. blok leksykalny
            //w ktorym mozna definiowac zmienne widoczne tylko w tym bloku

            //to jest inicjowane na nowo za kazdym obrotem petli zewnetrznej
            int y = 1;
            //petla wewnetrzna
            while (y <= 3) {
                System.out.println("(" + x + "," + y + ")");
                y++;
            }
            x++;
        }
        //zmienna y nie jest widoczna poza blokiem w ktorym zostala zdefiniowana
        //System.out.println(y);

        System.out.println("###############");

        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3) {
                if (j == 3) {
                    //ten break spowoduje przerwanie wykonywania
                    //tylko wewnetrznej petli
                    break;
                }
                System.out.println("(" + i + "," + j + ")");
                ++j;
            }
            if (i == 2) {
                //ten break jest na poziomie zewnetrznej petli
                //wiec spowoduje jej przerwanie
                break;
            }
            ++i;
        }
    }
}
