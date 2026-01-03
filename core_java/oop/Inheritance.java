package oop;

class Car{
    String carName = "BMW";
    
    public void display(){
        System.out.println("Parent Class");
    }
}

class CarDetails extends Car{
    String parentCompany = "Vokswagen";

    void displayDetails(){
        System.out.println("Car Name is: " + carName + "and Parent company is : " + parentCompany);
    }
}
public class Inheritance{
    public static void main(String[] args) {
        CarDetails cd = new CarDetails();
        cd.displayDetails();
    }
}
