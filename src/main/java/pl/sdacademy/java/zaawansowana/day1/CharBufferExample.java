package pl.sdacademy.java.zaawansowana.day1;

import java.nio.CharBuffer;
import java.util.Arrays;

public class CharBufferExample {
    public static void main(String[] args) {
//        CharBuffer buffer= CharBuffer.allocate(8);
        CharBuffer buffer= CharBuffer.allocate(2);
        String text = "sda";
        System.out.println("Input text: " + text);
        if (text.length() > buffer.capacity()) {
            System.out.printf("Zbyt mała wielkość bufora %d do długości tekstu %d", buffer.capacity(), text.length());
            return;
        }

//        if (text.length() <= buffer.capacity()) {
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                buffer.put(c);
            }
            System.out.println("Position after data is written into buffer: " + Arrays.toString(buffer.array()));
 //       } else System.out.printf("Zbyt mała wielkość bufora %d do długości tekstu %d", buffer.capacity(), text.length());

    }
}
