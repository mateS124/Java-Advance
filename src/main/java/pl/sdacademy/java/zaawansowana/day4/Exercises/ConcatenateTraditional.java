package pl.sdacademy.java.zaawansowana.day4.Exercises;

public class ConcatenateTraditional implements ConcatenateInterface{
    @Override
    public String concat(String a, String b){
        return a + " " + b;
    }

    public static void main(String[] args) {
        ConcatenateInterface concatenateTraditional = new ConcatenateTraditional();
        System.out.println(concatenateTraditional.concat("Wersja", " tradycyjna"));

    }
}
