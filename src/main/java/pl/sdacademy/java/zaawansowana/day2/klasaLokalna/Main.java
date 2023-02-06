package pl.sdacademy.java.zaawansowana.day2.klasaLokalna;

public class Main {
    public static void main(String[] args) {
        createPair("Rudy", 102);
    }

    public static void createPair(String key, int value) {
        class Pair {
            String key;
            int value;

            @Override
            public String toString() {
                return "Pair{" +
                        "key='" + key + '\'' +
                        ", value=" + value +
                        '}';
            }
        }
        Pair pair = new Pair();
        pair.key = key;
        pair.value = value;

        System.out.println(pair);
    }
}
