package pl.sdacademy.java.zaawansowana.day4.Exercises;

public class IncrementByValuLambda {
    public static void main(String[] args) {
        IncrementByValu increment = a ->  a * 10;
        System.out.println(increment.incrementValue(10));

    }
}
