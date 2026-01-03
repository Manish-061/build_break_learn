package oop;

class Bicycle{
    // state
    int gear = 5;

    // behavior
    void braking(){
        System.out.println("Work of brake.");
    }
}
public class ClassBasic {
    public static void main(String[] args) {
        // Creating Object
        Bicycle by = new Bicycle();
        by.gear = 10; // Here we have accessed and altered the variable value directly. To overcome this issue we will use Encapsulation.

        by.braking();
        System.out.println("Gear is: " + by.gear);
    }
}
