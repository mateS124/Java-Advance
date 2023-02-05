package pl.sdacademy.java.zaawansowana.day2.KlasyLokalne;

public class Main {
    public static void main(String[] args) {
        createPair("Rudy", 102);
        createPair2("Rudy", 102);
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

    public static void createPair2(String key, int value) {
        class Pair2 {
            String key;
            int value;

            @Override
            public String toString() {
                return "Pair2{" +
                        "key='" + key + '\'' +
                        ", value=" + value +
                        '}';
            }
        }
        Pair2 pair2 = new Pair2();
        pair2.key = key;
        pair2.value = value;

        System.out.println(pair2);
    }

}
