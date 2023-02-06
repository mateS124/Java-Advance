package pl.sdacademy.java.zaawansowana.day2.enums;

public class Main {
    public static void main(String[] args) {
        Coffee americano = Coffee.AMERICANO;
        String name = Coffee.AMERICANO.name();
        int ordinal = Coffee.AMERICANO.ordinal();
        System.out.println("1:" + americano + "\n2: " + name + "\n3:\t" + ordinal);
    }
}
