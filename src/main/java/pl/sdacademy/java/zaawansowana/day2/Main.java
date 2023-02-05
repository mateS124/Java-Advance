package pl.sdacademy.java.zaawansowana.day2;

import pl.sdacademy.java.zaawansowana.day2.Interfaces.HousePet;
import pl.sdacademy.java.zaawansowana.day2.Interfaces.Impl.SwinioOwca;
import pl.sdacademy.java.zaawansowana.day2.Interfaces.Impl.SwinkaMorska;

public class Main {
    public static void main(String[] args) {
        //wielopostaciowość

        Marta marta = new Marta();
        Marek marek = new Marek();

        Kowalscy[] marki = {marek}; // wielopostaciowość

        for (Kowalscy x : marki){
            System.out.println(x);
        }

        Dog pies = new Dog("Szarik");
        Dog pies1 = new Dog("Szarik1");
        Dog pies2 = new Dog("Szarik2");

        Cat cat = new Cat("Bonifacy");
        Cat cat1 = new Cat("Bonifacy1");
        Cat cat2 = new Cat("Bonifacy2");

        Dog[] dogs = {pies, pies1, pies2};
        for (Dog dog : dogs){
            dog.bark();
        }

        Cat[] cats = {cat, cat1, cat2};
        for (Cat ca : cats){
            ca.makeNoise();
        }
        System.out.println("@@@@@@@@@@");
        Animal[] animals = {pies, pies1, pies2,cat, cat1, cat2 };
        for (Animal animal : animals){
            animal.makeSound();
            animal.test();
            animal.getName();
        }

        System.out.println("***********");
        HousePet morska =new SwinkaMorska();
        SwinkaMorska morska2 = new SwinkaMorska();
        HousePet swinioOwca = new SwinioOwca();
        SwinioOwca swinioOwca2 = new SwinioOwca();

        HousePet[]  listaZwierzaków = {morska, morska2, swinioOwca, swinioOwca2};
        for (HousePet housePet : listaZwierzaków) {
            housePet.sound();
        }


    }
}
