package pl.sdacademy.java.zaawansowana.day1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("user.txt")) {
            try (FileOutputStream out = new FileOutputStream("user_output.txt")) {

                int c;
                while ((c = in.read()) != -1) {
                    System.out.println(c);
                    out.write(c);
                }
            }
        }

    }
}