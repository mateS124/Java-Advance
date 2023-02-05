package pl.sdacademy.java.zaawansowana.day2;

public class Cat extends  Animal{
   // private String name;

    public Cat(String name){
        this.name = name;
    }

    public void makeNoise(){
        System.out.println(name + " dał dłos miałłłł");
    }

    @Override
    public void makeSound() {
        makeNoise();
    }

    @Override
    public void test(){
        System.out.println("Metoda testowa z klasy kot");
    }
}
