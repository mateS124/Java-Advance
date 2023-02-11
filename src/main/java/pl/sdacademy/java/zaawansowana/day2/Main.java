package pl.sdacademy.java.zaawansowana.day2;

import pl.sdacademy.java.zaawansowana.day2.interfejsy.HousePet;
import pl.sdacademy.java.zaawansowana.day2.interfejsy.MediaPlayer;
import pl.sdacademy.java.zaawansowana.day2.interfejsy.impl.MediaPlayerImpl;
import pl.sdacademy.java.zaawansowana.day2.interfejsy.impl.SwinioOwca;
import pl.sdacademy.java.zaawansowana.day2.interfejsy.impl.SwinkaMorska;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // wielopostaciowość
        Marta marta = new Marta();
        Marek marek = new Marek();
        Kowalscy[] marki = {marek, marta}; //wielopostaciowość
//        Marta[] marty =  {marta, marek};

        for (Kowalscy x : marki) {
            System.out.println(x);
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
        Dog pies = new Dog("Szarik");
        Dog pies2 = new Dog("Szarik1");
        Dog pies3 = new Dog("Szarik2");

        Cat kot = new Cat("Bonifacy");
        Cat kot2 = new Cat("Bonifacy2");
        Cat kot3 = new Cat("Bonifacy3");

        Dog[] dogs = {pies, pies2, pies3};
        for (Dog dog : dogs) {
            dog.bark();
        }

        Cat[] cats = {kot, kot2, kot3};
        for (Cat cat : cats) {
            cat.makeNoise();
        }
        System.out.println("@@@@@@@@@@@@@@@@");
        Animal[] animals = {pies, pies2, pies3, kot, kot2, kot3};
        for (Animal animal : animals) {
            animal.makeSound();
            animal.test();
            System.out.println(animal.getName());
        }

        Animal animal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Klasa anonimowa");
            }
        };
        animal.makeSound();

        System.out.println("*******************");
        HousePet morska1 = new SwinkaMorska();
        SwinkaMorska morska2 = new SwinkaMorska();
        HousePet swinioOwca1 = new SwinioOwca();
        SwinioOwca swinioOwca2 = new SwinioOwca();

        HousePet[] listaZwierzakow = {morska1, morska2, swinioOwca1, swinioOwca2};
//        SwinkaMorska[] listaZwierzakow2 = {morska1, morska2, swinioOwca1, swinioOwca2};

        for (HousePet housePet : listaZwierzakow) {
            housePet.sound();
        }

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%");

        MediaPlayerImpl mediaPlayer = new MediaPlayerImpl();
        mediaPlayer.next();
        System.out.println(mediaPlayer.getName());
        mediaPlayer.stop();
        System.out.println(MediaPlayerImpl.NAZWA_NASZEGO_INTERFEJSU);
        System.out.println(MediaPlayer.getNazwaNaszegoInterfejsu());

        // Przykład implementacji interfejsów w Javie
        List<String> names;
        names = new ArrayList<>();
        names.add("Jarek");
        names.add("Marek");
        names.add("Arek");

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
    }
}
