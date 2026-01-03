package maths;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        
        System.out.println("Fibonacci sequence of " + n + " numbers (iterative):");
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

        System.out.println("\n\nFibonacci sequence of " + n + " numbers (recursive):");
        for(int i = 0; i < n; i++){
            System.out.print(fibonacciRecursion(i) + " ");
        }
        System.out.println();
    }

    static int fibonacciRecursion(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}
