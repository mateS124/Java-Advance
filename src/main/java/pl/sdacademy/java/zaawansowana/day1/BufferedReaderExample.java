package pl.sdacademy.java.zaawansowana.day1;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {


        BufferedReader in = new BufferedReader(new FileReader("User.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("user_output2.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            out.write(line);
            out.append("\n"); //dodajemy znak nowej linii
            out.write("\n"); //zapisujemy znak nowej linii
        }
        in.close();
        out.close();

    }
}
