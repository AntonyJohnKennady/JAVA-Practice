package Oops;

import java.util.Scanner;

class Personn{
    private String name;
    private int age;

    public Personn(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Person {
    public static void main(String[] args) {
        Personn person1=new Personn("John",20);
        Personn person2=new Personn("Ken",20);
        System.out.println("Person1 Name: "+person1.getName());
        System.out.println("Person1 Age: "+person1.getAge());
        System.out.println("Person2 Name: "+person2.getName());
        System.out.println("Person2 Age: "+person2.getAge());


    }
}
