package pl.sdacademy.java.zaawansowana.day3.Enums;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;



public class Main {
    public static void main(String[] args) {
        Coffee late = Coffee.LATE;
        Coffee americano = Coffee.AMERICANO;
        Coffee espresso = Coffee.ESPRESSO;

        System.out.println(late);
        System.out.println(Coffee.valueOf("LATE"));  //gdy nie mamy dostępu do enum tyko podajemy wartość tekstem
       System.out.println((Arrays.toString(Coffee.values())));
       Stream.of(Coffee.values()).forEach(System.out::println);
//        for (Coffee coffee : Coffee.values()){
//            System.out.println(coffee);
//        }
        System.out.println();

        Stream.of(DaysOfWeek.values()).forEach(System.out::println);

        System.out.println("%%%%%%%%%%%%%%%%%%");

        OrderCoffee orderAmericano = new OrderCoffee(Coffee.AMERICANO, 10);
   //     OrderCoffee americano1 = new OrderCoffee(Coffee.AMERICANO, 10);
        OrderCoffee orderLate = new OrderCoffee(Coffee.LATE, 10);
        OrderCoffee orderEspresso = new OrderCoffee(Coffee.ESPRESSO, 10);
    //                      index =        0               1          2
        OrderCoffee[] typTablicowy = {orderAmericano, orderLate, orderEspresso};
        OrderCoffee[] typTablicowy2 = new OrderCoffee[3];
        typTablicowy2[0] = orderAmericano;
        typTablicowy2[1] = orderLate;
        typTablicowy2[2] = orderEspresso;

        for (OrderCoffee orderCoffee : typTablicowy2){
            System.out.println("Price: " + orderCoffee.price);
            System.out.println(orderCoffee.coffee);
            System.out.println(orderCoffee.coffee.roast);
            System.out.println("Milk level: " + orderCoffee.coffee.milk);
            System.out.println("-----------------------");
        }


        Set<OrderCoffee> zbiórElementow = new HashSet<>();
        zbiórElementow.add(orderEspresso);
        zbiórElementow.add(orderEspresso);
        zbiórElementow.add(orderEspresso);
        zbiórElementow.add(orderEspresso);
        zbiórElementow.add(orderLate);

        zbiórElementow.forEach(System.out::println);



    }


}
