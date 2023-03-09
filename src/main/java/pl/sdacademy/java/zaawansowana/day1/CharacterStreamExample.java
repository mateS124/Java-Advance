package pl.sdacademy.java.zaawansowana.day1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) throws IOException {
        // zadeklarować zmienne FileReader i FileWriter.
        // stworzyć blok try -> finally
        // w bloku try przypisujemy obiekty do zmiennych
        // w finally zamykamy obiekty (uwaga , bo coś jeszcze trzeba yu zrobić) -> musimy sprawdzić czy są otwarte


        FileReader in = null; // = new FileReader("user.txt");
        FileWriter out = null; // = new FileWriter("user_output3.txt");

        try{
            in = new FileReader("User.txt");
            out  = new FileWriter("user_output2.txt");

            int nextChar;
            while ((nextChar = in.read()) != -1){
                out.append((char) nextChar);
                System.out.println("Pobrany znak: " + nextChar);
            }

        } finally {
            if (in != null) in.close();
            if (in != null)  out.close();

        }
    }
}
