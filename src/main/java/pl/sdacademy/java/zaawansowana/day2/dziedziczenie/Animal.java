package pl.sdacademy.java.zaawansowana.day2.dziedziczenie;

public abstract class Animal {
    private final String name;
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getSound();
}
