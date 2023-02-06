package pl.sdacademy.java.zaawansowana.day2.kompozycja;

public class Room {
    private Bed bed;
    private TV tv;

    public Room(Bed bed, TV tv) {
        this.bed = bed;
        this.tv = tv;
    }

    @Override
    public String toString() {
        return "Room:" +
                "\nbed=" + bed +
                "\ntv=" + tv;
    }
}
