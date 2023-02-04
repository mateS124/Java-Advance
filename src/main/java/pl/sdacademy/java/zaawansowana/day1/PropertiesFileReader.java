package pl.sdacademy.java.zaawansowana.day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
    public static void main(String[] args) throws IOException {
        //Odczytanie ustawień z pliku
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");

        // przepisyewanie ustawien z pliku
        prop.load(fis);

        //przypisanie parametrów  jdbc.properties\|username
        String username = prop.getProperty("jdbc.username");
        String password = prop.getProperty("jdbc.password");
        String driver = prop.getProperty("jdbc.driver");
        String local = prop.getProperty("jdbc.local", "pl");

        System.out.println("Login do bazy: " + username);
        System.out.println("Hasło do bazy: " + password);
        System.out.println("Sterownik do bazy: " + driver);
        System.out.println("Lokalizacja bazy: " + local);
        System.out.println(prop.getProperty("alaMaKota"));

    }
}
