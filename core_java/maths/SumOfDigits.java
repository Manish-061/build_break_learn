package maths;

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum is: " + sum);


        // Using while and method
        System.out.println("Using while loop and method: ");
        System.out.println(sumOfnNumbers(n));
        sc.close();

    }

    static int sumOfnNumbers(int n){
        int sum = 0;
        int i = 0;
        while(i <= n){
            sum += i;
            i++;
        }
        return sum;
    }
}
