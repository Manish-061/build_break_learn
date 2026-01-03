package oop;

class M{
    M(){  // If this is not provided explicitly, then it will genrate M(){super();} :-- super() is used to call the constructor of parent class
        System.out.println("Default Constructor.");
    }

    void display(){
        System.out.println("Class M");
    }
}

class Car{
    String carName;
    double carPrice;

    // Parameterized Constructor
    Car(String carName, double carPrice){
        this.carName = carName;
        this.carPrice = carPrice;
    }
    void details(){
        System.out.println("Car Name: " + carName + " Car Price: " + carPrice);
    }
}

class Student{
    String name;
    int age;

    // Parameterized Constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s1){
        name = s1.name;
        age = s1.age;
    }

    void display(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class Constructors {
    public static void main(String[] args) {
        M ob = new M();
        ob.display();

        Car c1 = new Car("BMW", 1_000_000);
        c1.details();

        Student s1 = new Student("Manish", 21);
        s1.display();
        Student s2 = new Student(s1);
        s2.display();
    }
}

/*
    In Java, Constructor overloading is allowed with different parameters in same class.
    Java does not provide in built copy constructor like C++. We have to implement it.
*/