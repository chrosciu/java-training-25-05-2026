package eu.chrost.day3.s1visibility.lectures.subpackage;

//klasy z innych pakietow musza byc wprost zaimportowane jesli chcemy ich tu uzyc
import eu.chrost.day3.s1visibility.lectures.Point;
//tego nie da sie zaimportowac - nie ma widocznosci publicznej tylko pakietowq
//import eu.chrost.day3.s1visibility.lectures.PackagePoint;

//nie trzeba importowac klas z pakietu java.lang - np. String

//subpackage jest kompletnie niezaleznym pakietem w stosunku do swojego przodka
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2.5, 3.5);

        //pole x ma widocznosc pakietowa wiec nie da sie do niego dostac z innego pakietu.
        //System.out.println(p1.x);


    }
}
