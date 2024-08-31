package Oops;
class   Dogg{
    private String name;
    private String breed;

    public Dogg(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
public class Dog {
    public static void main(String[] args) {
        Dogg dog1=new Dogg("Johnny","Labrador");
        Dogg dog2=new Dogg("Tony","Shepherd");
        System.out.println("Dog1 Name: "+dog1.getName());
        System.out.println("Dog1 Breed: "+dog1.getBreed());
        System.out.println("Dog2 Name: "+dog2.getName());
        System.out.println("Dog2 Breed: "+dog2.getBreed());
    }
}
