package pl.sdacademy.java.zaawansowana.day2.interfejsy;
@FunctionalInterface
public interface RemoteController  { // Interfejs funkcyjny, bo posiada jedną metodę abstrakcyjną
    public abstract void enable(boolean enable);
}
// Interfejsy gdzie mamy jedną metodę abstrakcyjną nazywane są również `SAM` - single abstract method
