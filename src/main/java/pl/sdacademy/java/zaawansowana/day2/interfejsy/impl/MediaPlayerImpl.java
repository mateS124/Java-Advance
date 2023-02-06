package pl.sdacademy.java.zaawansowana.day2.interfejsy.impl;

import pl.sdacademy.java.zaawansowana.day2.interfejsy.MediaPlayer;

public class MediaPlayerImpl implements MediaPlayer {
    @Override
    public void stop() {
        System.out.println("Implementacja STOP w klasie");
    }

    @Override
    public void print() {
        System.out.println("Implementacja PRINT w klasie");
    }
    private String name = "Implementacja interfejsu";

    public String getName() {
        return name;
    }
}
