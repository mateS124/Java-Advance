package pl.sdacademy.java.zaawansowana.day2.interfejsy.impl;

import pl.sdacademy.java.zaawansowana.day2.interfejsy.HousePet;

public class SwinioOwca implements HousePet {
    @Override
    public void sound() {
        System.out.println("chrum chrumm beeee beeeee");
    }
}
