package eu.chrost.day3.s5records.lectures;

//rekord jest zdegenerowana klasa
//przechowujaca wartosci swoich pol w formie niemutowalnej
//oraz dajaca z automatu kilka metod bez koniecznosci ich nadpisywania

//rekord deklarujemy poprzez podanie listy w naglowku rekordu
//pola w rekordzie sa automatycznie typu private final
public record Point(double x, double y) {

    //innych pol dodawac nie wolno
    //(nie dotyczy static)

    //oprocz metod dostarczonych automatycznie przez  Java mozna tworzyc swoje wlasne
    //i odwolywac sie w nich do pol
    public double distanceFromZero() {
        return Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
    }
}
