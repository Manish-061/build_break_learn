package conditionals;

public class ConsonantVowel {
    public static void main(String[] args) {
        char ch = 'm';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
