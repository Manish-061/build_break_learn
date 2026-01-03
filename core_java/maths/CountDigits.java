package maths;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        while (n > 0) {
            count += 1;
            n = n/10;
        }

        System.out.println("Digits are: " + count);

        // int counts = (int)Math.log10(Math.abs(n)) + 1;
        // System.out.println(counts); 
        // Inbuilt and My package name is same.


        sc.close();
    }    
}
