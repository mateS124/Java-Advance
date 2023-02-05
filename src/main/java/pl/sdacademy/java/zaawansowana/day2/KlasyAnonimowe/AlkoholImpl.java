package pl.sdacademy.java.zaawansowana.day2.KlasyAnonimowe;

public class AlkoholImpl implements Alkohol{
    String name;

    public AlkoholImpl(String name) {
        this.name = name;
    }

    @Override
    public void typAlkoholu() {
        System.out.println("Jestem sobie alkohol" + name);
    }
}
