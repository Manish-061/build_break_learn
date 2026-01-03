package conditionals;

import java.util.*;
public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of three angles: ");
        float a1 = sc.nextFloat();
        float a2 = sc.nextFloat();
        float a3 = sc.nextFloat();

        if(a1 + a2 + a3 == 180){
            System.out.println("Valid Triangle");
        }
        
        if(a1 == a2 && a2 == a3){
            System.out.println("Equilateral Triangle");
        }else if (a1 == a2 || a2 == a3 || a3 == a1){
            System.out.println("Isosceles Triangle");
        }else{
            System.out.println("Scalene Triangle");
        }

        sc.close();
    }
}
