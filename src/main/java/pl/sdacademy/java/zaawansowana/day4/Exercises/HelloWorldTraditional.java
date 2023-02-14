package pl.sdacademy.java.zaawansowana.day4.Exercises;

public class HelloWorldTraditional implements HelloWorldInterface{
    @Override
    public String sayHello(){
        return "Witaj na kursie";
    }

    public static void main(String[] args) {
        HelloWorldInterface hello = new HelloWorldTraditional();
        System.out.println(hello.sayHello());
    }


}
