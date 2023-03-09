package pl.sdacademy.java.zaawansowana.day2.Interfaces.Impl;

import pl.sdacademy.java.zaawansowana.day2.Interfaces.MediaPlayer;

public class MediaPlayerImpl implements MediaPlayer {
    public static void main(String[] args) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void next() {
        MediaPlayer.super.next();
    }
}
