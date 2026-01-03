package conditionals;

import java.util.*;
public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b && a % b == 0){
            System.out.println("Multiple");
        }else if(b > a && b % a == 0){
            System.out.println("Both are Multiple");
        }else{
            System.out.println("Both numbers are not multiple of each other.");
        }

        sc.close();
    }
}
