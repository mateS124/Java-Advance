package pl.sdacademy.java.zaawansowana.day2.kompozycja;

public class Bed {
    private String name;
    private String bedroomType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBedroomType() {
        return bedroomType;
    }

    public void setBedroomType(String bedroomType) {
        this.bedroomType = bedroomType;
    }

    @Override
    public String toString() {
        return "Bed:" +
                "\nname='" + name +
                "\nbedroomType='" + bedroomType;
    }
}
