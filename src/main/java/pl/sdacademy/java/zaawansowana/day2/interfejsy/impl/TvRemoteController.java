package pl.sdacademy.java.zaawansowana.day2.interfejsy.impl;

import pl.sdacademy.java.zaawansowana.day2.interfejsy.RemoteController;

public class TvRemoteController  implements RemoteController {

    @Override
    public void enable(boolean enable) {
        System.out.println("Włączam TV");
    }
}
