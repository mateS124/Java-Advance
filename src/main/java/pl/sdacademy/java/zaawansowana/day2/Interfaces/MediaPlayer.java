package pl.sdacademy.java.zaawansowana.day2.Interfaces;

public interface MediaPlayer {
    public static final String NAZWA_NASZEGO_INTERFEJSU = "MediaPlayer"; //domyślnie zawiera słowo kluczowe public
    public abstract void stop(); // domyślnie metody sa abstrakcyjne i publiczne

    public default void  next(){
        System.out.println("Jestem domyślną metodą z Interfejsu");
    }
}
