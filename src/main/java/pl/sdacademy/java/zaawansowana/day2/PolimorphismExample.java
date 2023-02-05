package pl.sdacademy.java.zaawansowana.day2;

import pl.sdacademy.java.zaawansowana.day2.Interfaces.Impl.ACRemoteController;
import pl.sdacademy.java.zaawansowana.day2.Interfaces.Impl.TvRemoteController;
import pl.sdacademy.java.zaawansowana.day2.Interfaces.RemoteController;

public class PolimorphismExample {
    public static void main(String[] args) {
        RemoteController remotController = new TvRemoteController() ;
        remotController.enable(true);

        remotController = new ACRemoteController();
        remotController.enable(true);
    }
}
