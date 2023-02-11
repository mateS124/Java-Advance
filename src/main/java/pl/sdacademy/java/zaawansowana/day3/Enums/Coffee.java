package pl.sdacademy.java.zaawansowana.day3.Enums;

public enum Coffee {
    LATE(10, Roast.BLONDE),
    ESPRESSO(0, Roast.DARK),
    AMERICANO(5, Roast.MEDIUM);

    int milk;
    Roast roast;

  //  Coffee(){} //konstruktor bezparametrowy do obiektów bez parametrów

    Coffee(int milk, Roast roast){
        this.milk = milk;
        this.roast = roast;
    }


}


