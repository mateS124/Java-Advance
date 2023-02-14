package pl.sdacademy.java.zaawansowana.day4.Exercises;

import com.google.common.collect.ImmutableList;
import pl.sdacademy.java.zaawansowana.day4.Utils.Car;
import pl.sdacademy.java.zaawansowana.day4.Utils.Data;
import pl.sdacademy.java.zaawansowana.day4.Utils.Person;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) throws IOException {
        List<Person> people = null;
        try{
            people = Data.getPeople();
        }catch (IOException e){
            System.out.println("Nie udało się wczytać danych z pliku");
        }

        // Odszukaj osoby mlodsze lub równe 18, wyswietl 10 pierwszych.
        // Podejście imperatywne


        final int limit = 10;
        List<Person> youngPeople;
//        assert people != null;
//        for (Person osoba : people){
//            //System.out.println(person);
//            if (osoba.getAge() <= 18){
//                youngPeople.add(osoba);
//                if(youngPeople.size() == limit){
//                    break;
//                }
//            }
//        }
//        youngPeople.forEach(System.out::println);

        // Podejście deklaratywne
        System.out.println("Stream");
        assert people != null;
        youngPeople = people.stream()
                .filter(person -> person.getAge() <= 18)
                .limit(limit)
                .collect(Collectors.toList());
        youngPeople.forEach(System.out::println);

        // Iterowanie po elementach listy według indeksu na liście
        System.out.println("Iterowanie po elementach listy według indeksu na liście");
        List<Person> finalPeople = people;
        IntStream.iterate(0, opereant -> opereant + 1)
                .filter(number -> number % 2 == 0)
                .limit(20)
                .forEach(index -> {
                    Person person = finalPeople.get(index);
                    System.out.println(index + " -> " + person);
                });
        IntStream.range(0, people.size())
                .forEach(index -> {
                    Person person = finalPeople.get(index);
                    System.out.println(index + " -> " + person);
                });

        System.out.println("\nPobieranie wartości min");
        List<Integer> numbers = ImmutableList.of(1,2,3,4,5,6,7,88,999,0);
        Integer min = numbers
                .stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println(min);

        System.out.println("\nPobieranie wartości max");
        //List<Integer> numbers = ImmutableList.of(1,2,3,4,5,6,7,88,999,0);
        Integer max = numbers
                .stream()
                .max(Comparator.naturalOrder())
                .orElse(0);

        System.out.println(max);

        numbers = ImmutableList.of(1,2,3,4,4,4,4,4,5,5,6,6,6,7,7,7,8,8,0,8,8,9,9,9,9,9,9,9);
        List<Integer> distinctNumbers = numbers
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);

        Set<Integer> setOfNumbersFromStream = new HashSet<>(numbers);
        System.out.println(setOfNumbersFromStream);

        Set<Integer> setOfNumbersFromConstructor = new HashSet<>(numbers);
        System.out.println(setOfNumbersFromConstructor);

        List<Car> cars = Data.getCars();
        double minCarValue;
        minCarValue = cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("fuscia"))
                .mapToDouble(Car::getPrice)
                .min()
                .orElse(10);
        System.out.println(minCarValue);

    }
}
