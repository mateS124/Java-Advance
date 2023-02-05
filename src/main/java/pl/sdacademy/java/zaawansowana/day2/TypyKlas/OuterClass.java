package pl.sdacademy.java.zaawansowana.day2.TypyKlas;

public class OuterClass {
    public static int outerClassStaticField;
    private int oterClassField;

    void outerClassMathod(){
        System.out.println("Jestem w klasie OuterClass - zwykła");
    }

    static void outerClassStaticMathod(){
        System.out.println("Jestem w klasie OuterClass - statyczna");
    }

    static class NestedStaticClass {
        String name;


        void useOuterclassField() {
            System.out.println(outerClassStaticField);
            outerClassStaticMathod();
            // System.out.println(outerClassMathod());  - nie mamy dostepu bo metoda nie statyczna
          //  outerClassMathod(); //nie mamy dostepu , metoda nie jkest statyczna
        }

    }


    void useInnerClassField() {
       // System.out.println(name2); nie ma dostepu do klasy inner

    }
        class innerClass {
            String name2;

           void useOuterClassField(){
               System.out.println(outerClassStaticField);
               outerClassMathod();
               System.out.println(oterClassField);
               outerClassStaticMathod();
           }

        }

}
