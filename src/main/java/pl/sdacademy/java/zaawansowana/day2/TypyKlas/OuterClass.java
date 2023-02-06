package pl.sdacademy.java.zaawansowana.day2.TypyKlas;

public class OuterClass {
    private static int outerClassStaticField;
    private int outerClassField;

    static void outerClassStaticMethod() {
        System.out.println("Jestem w klasie `OuterClass` - metoda statuczna");
    }

    void outerClassMethod() {
        System.out.println("Jestem w klasie `OuterClass` - metoda zwykła");
    }

    static class NestedStaticClass {
        String name;

        void useOuterClassField() {
            System.out.println(outerClassStaticField);
            outerClassStaticMethod();
//            System.out.println(outerClassField); // nie mamy dostępu do pola, ponieważ nie jest statyczne
//            outerClassMethod();// nie mamy dostępu do metody, ponieważ nie jest statyczne
        }
//        void useInnerClassField(){
//            System.out.println(name2); // nie mamy dostępu do pola
//        }
    }

    class InnerClass {
        String name2;

        void useOuterClassField() {
            System.out.println(outerClassStaticField);
            outerClassStaticMethod();
            System.out.println(outerClassField);
            outerClassMethod();
        }

//        void useNestedStaticClassField(){
//            System.out.println(name);// nie mamy dostępu do pola
//        }
        // czy mamy dostęp do pól z innych klas w tej klasie
    }

//    void useFieldsFromClasses(){
//        System.out.println(name);
//        System.out.println(name2);
//    }


}
