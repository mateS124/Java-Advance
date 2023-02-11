package pl.sdacademy.java.zaawansowana.day3.Enums;

public class OrderCoffee {
    Coffee coffee;
    int price;

    public OrderCoffee(Coffee coffee, int price) {
        this.coffee = coffee;
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderCoffee{" +
                "coffee=" + coffee +
                ", price=" + price +
                '}';
    }
}
