package pl.sdacademy.java.zaawansowana.day1;

import java.io.*;
import java.util.Arrays;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException, RuntimeException {
//        FileInputStream in = null;
//        FileOutputStream out = null;
//
//        try{
//            in = new FileInputStream("user.txt");
//            out = new FileOutputStream("user_output.txt");
//
//            int c;
//            while ((c = in.read()) != -1) {
//                System.out.println("Pobrany znak to: " + c + " " + (char)c);
//                out.write(c);
//
//
//            }
//
//        }catch (IOException e){
//            System.out.println("Pojawił się błąd: " + e);
//        }finally {
//            try {
//                in.close();
//                out.close();
//            }catch (IOException e){
//                throw new RuntimeException(e);
//            }
//
//        }
        // try with resources  automatycznie dodaje nam sprawdzanie wyjątków

        try (FileInputStream in = new FileInputStream("user.txt");
             FileOutputStream out = new FileOutputStream("user_output.txt")) {

            int c;
            while ((c = in.read()) != -1) {
                System.out.println("Pobrany znak to: " + c + " " + (char) c);
                out.write(c);


            }


        }


    }
}
