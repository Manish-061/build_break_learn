package oop;

interface Animal{
    void makeSound();
}

interface Bat{
    void fly();
}

// Multiple Inheritance implemented using interface.
public class MultipleInheritanceInterface implements Animal, Bat {
    public static void main(String[] args) {
        MultipleInheritanceInterface mi = new MultipleInheritanceInterface();
        mi.makeSound();
        mi.fly();
    }

    public void makeSound(){
        System.out.println("Animal make sound.");
    }

    public void fly(){
        System.out.println("Bats can Fly.");
    }
}
