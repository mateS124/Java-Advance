package pl.sdacademy.java.zaawansowana.day2.Interfaces.Impl;

import pl.sdacademy.java.zaawansowana.day2.Interfaces.RemoteController;

public class ACRemoteController implements RemoteController {

    @Override
    public void enable(boolean enable) {
        //włączenie/wyłączenie kilmatyzacji

            System.out.println("Wyłączam klimatyzację Do Zobaczenia");
    }
}
