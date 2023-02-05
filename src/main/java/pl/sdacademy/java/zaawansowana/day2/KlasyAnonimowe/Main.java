package pl.sdacademy.java.zaawansowana.day2.KlasyAnonimowe;

import pl.sdacademy.java.zaawansowana.day2.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Klasa anonimowa");
            }
        };
        animal.makeSound();


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

        Alkohol żołądkowa2 = new  AlkoholImpl("żołądkowa");
        Alkohol żubrówka2 = new AlkoholImpl("żubrówka");

        żołądkowa2.typAlkoholu();
        żubrówka2.typAlkoholu();

        class Leki implements Alkohol{
            String name;
            public Leki(String typLeku){
                this.name = typLeku;
            }

            @Override
            public void typAlkoholu(){
                System.out.println("Nie jestem alkoholem jestem leksrstwem");
            }

        };
        Leki syropNakaszel  = new Leki("Herbesal");
        syropNakaszel.typAlkoholu();

        Alkohol herbasal = new Alkohol() {
            @Override
            public void typAlkoholu() {
                System.out.println("Nie jestem alkoholem jestem lekarstwem Hebasal.");
            }

        };
        herbasal.typAlkoholu();
    }
}
