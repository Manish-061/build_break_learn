package maths;

import java.util.*;
public class DistinctOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3-digit number: ");
        int num = sc.nextInt();

        if(num < 100 && num > 999){
            System.out.println("Not a 3-digit number");
        }else{
            int d1 = num % 100; // Hundreds Digit
            int d2 = (num / 10) % 10; // Tens Digit
            int d3 = num % 10; //Ones Digit

            // checking whether all digits are distinct or not...
            if (d1 != d2 && d2 != d3 && d1 != d3){
                System.out.println("All digits are distinct.");
            }else{
                System.out.println("Digits are not distinct.");
            }
        }
        sc.close();
    }
}


// We can use Array to check for larger digit numbers. And can be done manually using digit extraction but it will be costly.
