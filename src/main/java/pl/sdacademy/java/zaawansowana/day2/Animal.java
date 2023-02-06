package pl.sdacademy.java.zaawansowana.day2;

public abstract class Animal {
    String name;
    public abstract void makeSound();
    public void test(){
        System.out.println("Metoda testowa");
    }

    public String getName() {
        return name;
    }
}
