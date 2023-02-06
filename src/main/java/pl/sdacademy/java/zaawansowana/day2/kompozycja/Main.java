package pl.sdacademy.java.zaawansowana.day2.kompozycja;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed();
        bed.setName("King size");
        bed.setBedroomType("Romantyczna");

        Room room = new Room(bed, new TV(34, "LG"));
        System.out.println(room);
    }
}
