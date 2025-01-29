import java.util.Scanner;

public class ques_09 {
    public static void main(String[] args) {
        System.out.println("WAP to check if the character is lowercase, uppercase or digit");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter single character : ");
        char ch = sc.next().charAt(0);

        if(Character.isLowerCase(ch)){
            System.out.println(ch + " is lowercase.");
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is UPPERCASE");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        }
        else{
            System.out.println("Enter valid character.");
        }
    }
}
