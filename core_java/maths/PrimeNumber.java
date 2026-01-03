package maths;
import java.io.*;

public class PrimeNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String stringInt = br.readLine();
        int n = Integer.parseInt(stringInt);

        // Edge Cases
        if(n < 2) System.out.println("Neither Prime nor Composite Number.");

        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime NUmber");
        }
    }    
}
