package pl.sdacademy.java.zaawansowana.day2.Interfaces.Impl;

import pl.sdacademy.java.zaawansowana.day2.Interfaces.HousePet;

public class SwinioOwca implements HousePet {

    @Override
    public void sound() {
        System.out.println(" Piii Beee Bee Pii");
    }
}
