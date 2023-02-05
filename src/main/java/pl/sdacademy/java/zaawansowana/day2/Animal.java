package pl.sdacademy.java.zaawansowana.day2;

public abstract class Animal {
    String name;

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    public void test(){
        System.out.println("Metoda testowa z klasy Animal");
    }



    public void print() {
        System.out.println("Bez argumentów");
    }

    public void print(String text) {
        System.out.println("Przyjmuje String");
    }

    public void print(int x) {
        System.out.println("Przyjmuje Integer");
    }
}
