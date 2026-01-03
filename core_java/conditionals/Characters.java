package conditionals;

import java.util.*;
public class Characters {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        char ch = sc.next().charAt(0);
        rangeBased(ch);

        ascciBased(ch);

        sc.close();
    }

    static void rangeBased(char ch){

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("UpperCase");
        }else if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowecase");
        }else if(ch >= '0' && ch <= '9'){
            System.out.println("Digits");
        }else{
            System.out.println("Special Character");
        }
    }

    static void ascciBased(char ch){
        int ascii = ch;
        if(ascii >= 65 && ascii <= 90){
            System.out.println("Uppercase");
        }else if(ascii >= 97 && ascii <= 122){
            System.out.println("Lowercase");
        }else if(ascii >= 48 && ascii <= 57){
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }
    }

    // can be checked using inbuilt functions.
    /*
    Character.isUpperCase()
    Character.isLowerCase()
    Character.isDigit()
    Else Special character
    */ 

    // One more way is to using Regex -- Regular Expression
    // static void regEx(char ch){
    //     if(ch.matches("[A-Z]")){
    //         System.out.println("Uppercase");
    //     }
    // }   
    // For this one we have to use string as input.
}
