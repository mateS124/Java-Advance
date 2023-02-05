package pl.sdacademy.java.zaawansowana.day2;

public class Dog extends  Animal{
   // private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void  bark(){
        System.out.println(name + " dał głos - Hau hau hau");
    }

    @Override
    public void makeSound() {
        bark();
    }
}
