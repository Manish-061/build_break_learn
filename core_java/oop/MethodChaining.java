package oop;

class M{

    private int a;
    private float b;


    M(){
        System.out.println("Calling Constructor.");
    }

    public M setint(int a){
        this.a = a;
        return this; // return this.a: It will return:-  error: int cannot be dereferenced. Here if we do not return an object and call setfloat() then it will give error.
    }

    public M setfloat(float b){
        this.b = b;
        return this;
    }

    void display(){
        System.out.println("A: " + a + " B: " + b);
    }
}

public class MethodChaining {
    public static void main(String[] args) {
        new M().setint(10).setfloat(20).display();
    }
}
