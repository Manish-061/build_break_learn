package oop;

abstract class M{
    abstract void start(); // abstract method does not have body, must be implemented by child or sub class

    public void stop(){   // Concrete method
        System.out.println("Manish is coding."); 
    }
}

class K extends M{
    public void start(){
        System.out.println("Manish Started Preparation, this time with better plan.");
    }

    @Override
    public void stop(){
        System.out.println("Overriden Method");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        K k = new K();
        k.start();
        k.stop();
    }
}
