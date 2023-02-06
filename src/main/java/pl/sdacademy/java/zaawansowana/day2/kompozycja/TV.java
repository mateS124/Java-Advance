package pl.sdacademy.java.zaawansowana.day2.kompozycja;

public class TV {
    private int size;
    private String type;

    public TV(int size, String type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "TV{" +
                "size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
