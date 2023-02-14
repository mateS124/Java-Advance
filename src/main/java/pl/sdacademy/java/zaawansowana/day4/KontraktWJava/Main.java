package pl.sdacademy.java.zaawansowana.day4.KontraktWJava;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //porównanie dwóch wartości x oraz y
        // - jeżeli 'x.hashCode() == y.hashCode()' obiekty mogą ale nie muszą być równe i wywołujemy metodę equals
       // - obiekty są równe tylko wtedy kiedy  'x.hashCode() == y.hashCode()' oraz 'x.equals(y) == true'
       // - jeżeli 'x.equals(y) == true' to musi być spełniony warunek 'x.hashCode() == y.hashCode()'

        int x = 10;
        int y = 10;
        boolean comparationOfPrimitives = (x == y);
        System.out.println(comparationOfPrimitives);

        Car car1 = new Car("Syrenka", "Sport");
        Car car2 = new Car("Syrenka", "Sport");
        Car car3 = car1;

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        boolean comparationOfObjects = car1 == car2;
        boolean comparationOfObjects2 = car1 == car3;


        System.out.println(comparationOfObjects);
        System.out.println(comparationOfObjects2);

        System.out.println("Porównanie obiektów ");
        boolean comparationOfObject3 = car1.equals(car2);
        boolean comparationOfObject4 = car3.equals(car2);
        System.out.println(comparationOfObject3);
        System.out.println(comparationOfObject4);
    }

    private static class Car {
        String name;
        String type;

        public Car(String name, String type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Car)) return false;
            Car car = (Car) o;
            return Objects.equals(name, car.name) &&
                    Objects.equals(type, car.type);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, type);
        }
    }
}
