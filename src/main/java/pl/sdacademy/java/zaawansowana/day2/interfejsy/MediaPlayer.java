package pl.sdacademy.java.zaawansowana.day2.interfejsy;
//@FunctionalInterface
public interface MediaPlayer {
    public static final String NAZWA_NASZEGO_INTERFEJSU = "MediaPlayer"; // domyślnie zawiera słowa kluczowe `public static final`
    public abstract void stop(); // domyślnie metody są abstrakcyjne i publiczne
    public default void next(){
        System.out.println("Jestem metodą domyślną z interfejsu");
    }
    public static String getNazwaNaszegoInterfejsu(){
        return NAZWA_NASZEGO_INTERFEJSU;
    }
    public abstract void print();
}
