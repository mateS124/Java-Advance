package pl.sdacademy.java.zaawansowana.day2.dziedziczenie;

public class Lion extends Animal{
    @Override
    public String getSound() {
        return "Wrrrrrrrr";
    }

    public Lion(String name){
        super(name);
    }
}
