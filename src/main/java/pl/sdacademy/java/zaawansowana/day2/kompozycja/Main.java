package pl.sdacademy.java.zaawansowana.day2.kompozycja;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed();               // Nie posiada konstruktora więc musimy stworzyć obiekt
        bed.setName("King size");          // Przypisujemy nazwe i rodzaj za pomocąą setterów
        bed.setBedroomType("Romantyczna");  // dopiero już stworzony obiekt możemy użyć w Room

        Room room = new Room(bed, new TV(34, "LG")); // TV posiada konstruktor więc możemy użyć new TV
                                                               // do stworzenia obiektu bezpośrednio w Room
                                                                //
        System.out.println(room);


    }
}
