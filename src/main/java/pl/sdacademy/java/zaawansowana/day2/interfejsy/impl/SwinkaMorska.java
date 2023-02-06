package pl.sdacademy.java.zaawansowana.day2.interfejsy.impl;

import pl.sdacademy.java.zaawansowana.day2.interfejsy.HousePet;

public class SwinkaMorska implements HousePet {
    @Override
    public void sound() {
        System.out.println("Piiii piii piiiiiiii");
    }
}
