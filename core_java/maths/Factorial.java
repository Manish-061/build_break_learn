package maths;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(factorial(n));
        System.out.println(factorialRecursion(n));

    }

    static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }

    static int factorialRecursion(int n){
        if(n == 0) return 1;
        
        return n *factorialRecursion(n - 1);
    }
}
