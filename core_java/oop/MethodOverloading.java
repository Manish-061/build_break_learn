package oop;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.add(4, 0));
        mo.add(45.5, 56.5);
        mo.add(78.5, 88, 89.5);
    }

    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    double add(double a, double b, double c){
        return a + b + c;
    }
}
