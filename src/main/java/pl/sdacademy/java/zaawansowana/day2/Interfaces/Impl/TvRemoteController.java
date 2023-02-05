package pl.sdacademy.java.zaawansowana.day2.Interfaces.Impl;

import pl.sdacademy.java.zaawansowana.day2.Interfaces.RemoteController;

public class TvRemoteController implements RemoteController {

    @Override
    public void enable(boolean enable) {
        //włączenie/wyłączenie telewizora
        System.out.println("Włącz TV");
    }
}
