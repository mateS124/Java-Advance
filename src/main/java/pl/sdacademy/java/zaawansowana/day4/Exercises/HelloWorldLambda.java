package pl.sdacademy.java.zaawansowana.day4.Exercises;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface hello = () -> "Witaj na kursie";
        System.out.println(hello.sayHello());

        HelloWorldInterface hello1 = () ->{
            System.out.println("Jestem w Lambda");
            return  "Witaj na kursie";
        };
        System.out.println(hello1.sayHello());
    }
}
