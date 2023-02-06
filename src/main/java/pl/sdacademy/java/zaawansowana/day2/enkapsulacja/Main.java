package pl.sdacademy.java.zaawansowana.day2.enkapsulacja;

public class Main {
    public static void main(String[] args) {
        Prisoner prisoner = new Prisoner("1", "Jan", "Kowalski");
        System.out.println(prisoner.getLastName());
        System.out.println(prisoner.getName());
    }
}
