package maths;

import java.util.Scanner;
public class DistinctFourDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num < 1000 && num > 9999){
            System.out.println("Invalid Input, Enter 4-digit Number");
        }else{
            boolean[] seen = new boolean[10]; //0-9 tracking
            boolean isDistinct = true;

            int temp = num;

            while (temp > 0) {
                int digit = num % 10;
                if(seen[digit]){
                    isDistinct = false;
                    break;
                }
                seen[digit] = true;
                temp /= 10;
            }

            if(isDistinct) {
                System.out.println("All digits are distinct.");
            } else {
                System.out.println("Digits are not distinct.");
            }
        }
        sc.close();
    }
}
