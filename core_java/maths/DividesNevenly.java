package maths;
import java.io.*;

public class DividesNevenly {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String n = br.readLine();
        int num = Integer.parseInt(n);

        System.out.println(dividesEvenly(num));

    }   
    
    static int dividesEvenly(int num){
        int count = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;
            if(digit != 0 && original % digit == 0){
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
