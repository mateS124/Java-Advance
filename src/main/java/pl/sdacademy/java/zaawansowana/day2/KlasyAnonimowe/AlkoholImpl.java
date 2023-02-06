package pl.sdacademy.java.zaawansowana.day2.KlasyAnonimowe;

public class AlkoholImpl implements Alkohol{
    String name;

    public AlkoholImpl(String alkoholType){
        this.name = alkoholType;
    }
    @Override
    public void typAlkoholu() {
        System.out.println("Jestem sobie " + name);
    }
}
