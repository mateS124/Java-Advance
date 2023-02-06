package pl.sdacademy.java.zaawansowana.day2.interfejsy.impl;

import pl.sdacademy.java.zaawansowana.day2.interfejsy.RemoteController;

public class ACRemoteController implements RemoteController {
    
    @Override
    public void enable(boolean enable) { /* jest to metoda */
        System.out.println("Włączam klimatyzację");
    }
}
