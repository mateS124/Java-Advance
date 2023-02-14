package pl.sdacademy.java.zaawansowana.day4.Exercises;

@FunctionalInterface
interface Executable{
    int execute();
}

class Runner{
    public void run(Executable e){
        System.out.println("Jestem w runner");
        int value = e.execute();
        System.out.println("Zwrócona wartość to ");
    }
}
public class LambdaExample {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Jestem w implementacji klasy anonimowej");
                return 40;
            }
        });

        System.out.println("************************");
        runner.run(() -> {
            System.out.println("Jestem w implementacji za pomoca lambdy");
            return 90;
        });

    }
}
