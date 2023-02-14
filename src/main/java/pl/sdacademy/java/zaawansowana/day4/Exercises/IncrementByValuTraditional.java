package pl.sdacademy.java.zaawansowana.day4.Exercises;

public class IncrementByValuTraditional implements IncrementByValu{
    @Override
    public int incrementValue(int a) {
        return a * 10;
    }
    public static void main(String[] args) {
        IncrementByValu increment = new IncrementByValuTraditional();
        System.out.println(increment.incrementValue(10));
    }



}
