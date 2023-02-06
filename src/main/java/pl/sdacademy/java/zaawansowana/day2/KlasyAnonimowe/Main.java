package pl.sdacademy.java.zaawansowana.day2.KlasyAnonimowe;



import pl.sdacademy.java.zaawansowana.day2.Animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal słoń = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Turuuu");
            }
        };
        słoń.makeSound();


        Alkohol żołądkowa = new Alkohol() {
            @Override
            public void typAlkoholu() {
                System.out.println("Jestem sobie żołądkowa");
            }
        };
        żołądkowa.typAlkoholu();

        Alkohol żubrówka = new Alkohol() {
            @Override
            public void typAlkoholu() {
                System.out.println("Jestem sobie żubrówka");
            }
        };
        żubrówka.typAlkoholu();

        Alkohol żołądkowa2 = new AlkoholImpl("żołądkowa");
        Alkohol żubrówka2 = new AlkoholImpl("żubrówka");

        żołądkowa2.typAlkoholu();
        żubrówka2.typAlkoholu();


        class Leki implements Alkohol{
            String nazwa;
            public Leki(String typLeku){
                this.nazwa = typLeku;
            }

            @Override
            public void typAlkoholu() {
                System.out.println("Nie jestem alkoholem jestem lekarstwem " + nazwa);
            }
        }

        Leki syropNaKaszel = new Leki("Hebersal");
        syropNaKaszel.typAlkoholu();

//        Alkohol heberasal = new Alkohol() {
//            @Override
//            public void typAlkoholu() {
//                System.out.println("Nie jestem alkoholem jestem lekarstwem Hebersal");
//            }
//        };
//        heberasal.typAlkoholu();

        // klasa aonimowa w postaci lambdy
        Alkohol heberasal = () -> System.out.println("Nie jestem alkoholem jestem lekarstwem Hebersal");
        heberasal.typAlkoholu();
    }
}
