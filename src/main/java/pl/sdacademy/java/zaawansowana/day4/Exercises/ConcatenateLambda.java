package pl.sdacademy.java.zaawansowana.day4.Exercises;

public class ConcatenateLambda {
    public static void main(String[] args) {
        ConcatenateInterface anonimusClass = new ConcatenateInterface() {
            @Override
            public String concat(String a, String b) {
                return a + " " + b;
            }
        };
        System.out.println(anonimusClass.concat("Wersja", "anonimowa"));

        ConcatenateInterface asLambda = ( a, b) ->  a + " " + b;
        System.out.println(asLambda.concat("Wersja", "Lambda"));

    }
}
