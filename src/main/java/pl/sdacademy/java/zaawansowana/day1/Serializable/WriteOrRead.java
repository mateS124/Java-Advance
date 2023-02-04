package pl.sdacademy.java.zaawansowana.day1.Serializable;

import java.io.*;

public class WriteOrRead {
    public static void main(String[] args) {
        Person p1 = new Person("Mateusz", 40, "M");
       // Person p2 = new Person("Bolesław", 45, "M");
        Person p3 = new Person("Anna", 25, "F");

        try{

            //Zapis do pliku
            FileOutputStream fos = new FileOutputStream("myPerson.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(p1);
            oos.writeObject(p3);

            fos.close();
            oos.close();

            //Odczyt z pliku

            FileInputStream fis = new FileInputStream("myPerson.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

           // ois.readObject();
            Person mateusz = (Person) ois.readObject();
            Person anna = (Person) ois.readObject();

            System.out.println("wzór: " + p1 + ", odczytano z pliku " + mateusz);
            System.out.println("wzór: " + p3 + ", odczytano z pliku " + anna);

        }catch (FileNotFoundException e){
            System.out.println("Nie znalazłem pliku " + e);
        }catch (ClassNotFoundException e) {
            System.out.println("Nie znaleziono klasy do serializacji: " + e);
        }catch (IOException e){
            System.out.println("Błąd przy inicjalizacji strumienia: " + e);
        }
    }
}
