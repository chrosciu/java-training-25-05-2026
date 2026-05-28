package eu.chrost.day4.s1inheritance.lectures;

public class Null {
    public static void main(String[] args) {
        //null jest specjalna referencja jaka mozna przypisac do kazdego typu obiektowego
        //oznaczajaca nie wskazywanie na zadne miejsce w pamieci
        //tzw. pusta referencja
        Employee employee = null;

        //zawolanie tego kodu w runtime wygeneruje NullPointerException (NPE)
        //System.out.println(employee.getName());

        //to tez wywola NPE
        //System.out.println(employee.toString());

        //to zadziala bo println pod spodem jest zabezpieczony na wartosc null
        System.out.println(employee);
    }
}
