import java.util.Scanner;

public class ques_5 {
    public static void main(String[] args) {
        System.out.println("Check whether a character is a vowel or consonant.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character alphabet : ");
        char ch = sc.next().charAt(0);

        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a vowel.");
        }
        else {
            System.out.println(ch + " is a consonant.");
        }
    }
}
