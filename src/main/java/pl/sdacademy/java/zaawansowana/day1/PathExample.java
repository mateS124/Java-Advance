package pl.sdacademy.java.zaawansowana.day1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathExample {


    public static void main(String[] args) throws IOException {
      Path path = Paths.get("data.txt");
        Files.createFile(path);
        Files.write(path, "A long time agoe...  ".getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "A long time ".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, "Far away...\n".getBytes(), StandardOpenOption.APPEND);

//        for (int i = 0; i <= Files.readAllLines(path); i++){
//            System.out.println(line);
//        }

//        for (String line : Files.readAllLines(path)){
//            System.out.println(line);
//        }
        Files.readAllLines(path).forEach(System.out::println);

        Files.delete(path);
    }
}
