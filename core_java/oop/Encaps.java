package oop;

class Student {
    // To achieve encapsulation we must declare variables using "private" access modifier
    private String name;
    private String email;
    private int enrollment;

    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    int getEnroll() {
        return enrollment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEnroll(int enrollment) {
        this.enrollment = enrollment;
    }
}

public class Encaps {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Manish Kumar");
        s1.setEmail("manish@gmail.com");
        s1.setEnroll(3061);

        System.out.println("Name: " + s1.getName() + " Email: " + s1.getEmail() + " Enrollment: " + s1.getEnroll());
    }
}

/*  Other Encapsulation Methods are :
    1. Read Only : Class only consist of getter methods
    2. Write Only: Class only consist of setter methods

    "this" keyword: refers to current instance of a class. Pass current object as parameter to another method.
*/

