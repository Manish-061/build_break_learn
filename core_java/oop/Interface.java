package oop;

interface Animal{
    void makeSound();
    String animalName = "Dog";
}

class Dog implements Animal{
    public void makeSound(){
        System.out.println(animalName + " " + "Barks.");
    }
}

class Lion implements Animal{
    public void makeSound(){
        System.out.println("Lions: Roar.");
    }
}
public class Interface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();

        Lion l = new Lion();
        l.makeSound();

        Animal a = new Dog();
        a.makeSound();
    }
}
