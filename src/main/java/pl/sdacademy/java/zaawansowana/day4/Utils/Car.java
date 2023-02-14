package pl.sdacademy.java.zaawansowana.day4.Utils;

public class Car {
    private Integer id;
    private String make;
    private String model;
    private Double price;
    private Integer year;
    private String color;


    public Car(Integer id, String make, String model, Double price, Integer year, String color) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public Double getPrice() {
        return price;
    }
}
