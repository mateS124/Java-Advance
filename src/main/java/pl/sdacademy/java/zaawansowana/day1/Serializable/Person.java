package pl.sdacademy.java.zaawansowana.day1.Serializable;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private String gender;

    public Person( String name,  int age,  String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
