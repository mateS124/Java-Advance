package pl.sdacademy.java.zaawansowana.day3.Kolections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>(); //struktura generyczna przechowujaca unikalne elementy
                                             // nie zachowuje kolejności
        names.add("John");
        names.add("Neeki");
        names.add("Packia");
        names.add("Marek");
        names.add("Karol");
        names.add("Marta");
        names.add("John");
        if (names.contains("John")){
            System.out.println("Element istniej");
        }
        for (String name : names) {
            System.out.println(name);
        }


        System.out.println("**************************");

        System.out.println("zwykły HashSe nie zachowuje kolejności");
        Set<Integer> numbers = new HashSet<>();
        System.out.println(numbers.isEmpty());
        numbers.add(1);
        numbers.add(17);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        for (Integer number : numbers){
            System.out.println(number);
        }

        System.out.println("-----");

        numbers.forEach(System.out::println);
        System.out.println("***************************");


        System.out.println("TreeSet, sortuje kolejność");
        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(1);
        sortedSet.add(17);
        sortedSet.add(3);
        sortedSet.add(2);
        sortedSet.add(1);
        sortedSet.forEach(System.out::println);
        System.out.println("*************************");
        System.out.println("LinkedHashSet, zachowuje kolejność dodawania");
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(17);
        linkedHashSet.add(300);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        linkedHashSet.forEach(System.out::println);
        System.out.println("**************************");
        System.out.println("List - ArrayList");
        List<Float> transfers = new ArrayList<>();
        transfers.add(120.0f); // 0
        transfers.add(400.0f); // 1
        transfers.add(5000.0f); // 2
        for (Float transfer : transfers) {
            System.out.println(transfer);
        }
        System.out.println("-------------------------");
      //  transfers.add(5, 999999999.9F); //IndexOutOfBound
        transfers.add(1, 4000000.0F);
        System.out.println(transfers.size());
        System.out.println("-----------------------");

        transfers.forEach(System.out::println);
        System.out.println("-----------------------");
        System.out.println(transfers.get(2));
        System.out.println("*********************************");
        System.out.println("Listy - LinkedList");
        List<String> surnames = new LinkedList<>();
        surnames.add("a");
        surnames.add("b"); // =>  a | b | c poprzedza a my jestecmy b za nami c
        surnames.add("c"); // =>  b | c | d
        surnames.add("d"); // =>  c | d | null

        surnames.forEach(System.out::println);

        surnames.add(2, "x");
         // po dodaniu bedzie tak:
        // "a"
        // "b" => a | b | x
        // "x" => b | x | c
        // "c" => x | c | d
        // "d"
        System.out.println("-------------------------");
        surnames.forEach(System.out::println);
        System.out.println("*******************************");

        System.out.println("Queue - kolejki ");

        Queue<String> pokemons = new LinkedList<>();
        pokemons.offer("Pikachu"); // Dodanie nowego elementu
        pokemons.offer("Charmander");
        pokemons.offer("Charmander");
        pokemons.offer("Charmander");
        System.out.println(pokemons.peek()); // podgląd pierwszego elementu w kolejce
        System.out.println(pokemons.poll()); // pobiera pierwszy element z kolejki i go usuwa
        System.out.println(pokemons.remove()); // pobiera i usuwa pierwszy element z kolejki lub zwraca błąd
        System.out.println(pokemons.element()); // zwraca pirewszy element z kolejki lub błąd
        System.out.println("------------------------");
        pokemons.forEach(System.out::println);
        System.out.println("******************************" );

        System.out.println("Dqueue - Kolejka pobierająca z początku lub końca kolejki");
        Deque<Integer> deQueue = new ArrayDeque<>();
        deQueue.addLast(20);
        deQueue.offerLast(10);
        deQueue.offerFirst(12);
        deQueue.addFirst(11);

        System.out.println(deQueue.peekFirst());
        System.out.println(deQueue.peekLast());

        System.out.println("!!!!!!!!!!!!!!!!LiFo!!!!!!!!!!!!!!!!");
        Queue<Integer> lifoQueue = Collections.asLifoQueue( new ArrayDeque<>());
        lifoQueue.offer(1);
        lifoQueue.offer(2);
        lifoQueue.offer(3);
        lifoQueue.forEach(System.out::println);

        System.out.println("*********************************" );
        System.out.println("Map - Kolekcja posiadająca klucz , ktoremu odpowiada wartość");

        Map<String, Float> employees = new HashMap<>();
        //dodawania elementów do mapy
        employees.put(null, 3000.0f);
        employees.put("John Dool", 3000.0f);
        employees.put(null, 4500.0f);  // co w tym przypadku
        employees.put("Prasad A", null);
        employees.put("Prasad B", null);
        employees.put("Prasad C", null);
        employees.put("Prasad D", 1000.0f);
        //usuwanie element z mapy o danym kluczu
        employees.remove("John Dool");
        //pobieranie elementu z mapy o danym kluczu
        System.out.println(employees.get("Prasad D"));
        System.out.println( "Czy posiada klucz: " +  employees.containsKey(null));
        System.out.println("czy posiada wartość: " + employees.containsValue(null));
        System.out.println(employees.size());
        System.out.println(employees.isEmpty());
        System.out.println("------------------");

        for (String key : employees.keySet()) {
            System.out.println("Pracownik: " + key);
        }
        System.out.println("-------------------");
        for (Float value : employees.values()) {  // aby nie wyrzuciło błędu trzeba zmienić float na Float
                                              // typ prymitywny na obiekt
            System.out.println("Wypłata: "+ value);
        }
        System.out.println("-------------------");
        for (Map.Entry<String, Float> pair : employees.entrySet()) {
            System.out.println("Pracownik-wypłata " + pair);
        }

        employees.entrySet();

        System.out.println("!!!!!!!!!!!!!!LinkedHashMap!!!!!!!!!!");
        Map<Integer, String> employeesAge = new LinkedHashMap<>();
        //dodawania elementów do mapy
        employeesAge.put(null, "Antek");
        employeesAge.put(33, null);
        employeesAge.put(24, "Hanna");  // co w tym przypadku
        employeesAge.put(15, "Teofil");
        employeesAge.put(30, "Antek");
        employeesAge.keySet().forEach(System.out::println);
        employeesAge.values().forEach(System.out::println);
        employeesAge.entrySet().forEach(System.out::println);

        if (employeesAge.containsKey(30)){
            System.out.println("jest");
        }else{
            System.out.println("Nie ma");
        }

        System.out.println(employeesAge.containsKey(30) ? "Jest"  : "Nie ma");
        System.out.println("!!!!!!!!!!!!!TreeMap!!!!!!!!!!!!");
        Map<Integer, Integer> sumOfDigit = new TreeMap<>();
        sumOfDigit.put(44, 8);
        sumOfDigit.put(55, 10);
        sumOfDigit.put(11, 2);
        sumOfDigit.put(24, 6);

        sumOfDigit.entrySet().forEach(System.out::println);




    }
}
