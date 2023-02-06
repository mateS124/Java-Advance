package pl.sdacademy.java.zaawansowana.day2;

public class Cat extends Animal{
//    private String name;

    public Cat(String name){
        this.name = name;
    }

    public void makeNoise(){
        System.out.println(name + " dał głos - Mrauuuuuu");
    }
    @Override
    public void makeSound(){
        makeNoise();
    }

    @Override
    public void test(){
        System.out.println("Metoda testowa z klasy kot");
    }
    // przykład przeciążania metod Overload
    public void print(){
        System.out.println("bez argumentów");
    }

    public void print(String text){
        System.out.println("Przyjmuje String");
    }

    public void print(int liczba){
        System.out.println("Przyjmuje integer");
    }
}
