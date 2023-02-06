package pl.sdacademy.java.zaawansowana.day2;

import pl.sdacademy.java.zaawansowana.day2.interfejsy.RemoteController;
import pl.sdacademy.java.zaawansowana.day2.interfejsy.impl.ACRemoteController;
import pl.sdacademy.java.zaawansowana.day2.interfejsy.impl.TvRemoteController;

public class PolimorphismExample {
    public static void main(String[] args) {

        RemoteController remoteController;
        remoteController = new TvRemoteController();
        remoteController.enable(true);

        remoteController = new ACRemoteController();
        remoteController.enable(true);

    }
}
