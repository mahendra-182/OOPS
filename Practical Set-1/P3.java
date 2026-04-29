import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ENTER A SINGLE LETTER (A-Z) :- ");
        char ch = sc.next().charAt(0);
        
        ch = Character.toLowerCase(ch);
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("ENTERED CHARACTER IS A VOWEL.");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("ENTERED CHARACTER IS A CONSONANT.");
        } 
        else {
            System.out.println("INVALID INPUT !!!");
        }
    }
}