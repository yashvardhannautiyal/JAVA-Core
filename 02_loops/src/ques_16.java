import java.util.Scanner;

public class ques_16 {
    public static void main(String[] args) {
        System.out.println("Check if a given number is a palindrome.");
//        palindrome number : reversing the number gives same number eg: 121, 454, 111, etc.
//        if(num<10){ !palindrome}
//        if(reverseNum == num){palindrome}

        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int initialNum = num;
        int rev = 0;

        while(num>0){
            int digit = num%10; //gives last digit of number
            rev = rev*10 + digit; // adds last digit
            num = num/10; //removes last digit
        }

        if(rev == initialNum){
            System.out.println(initialNum + " is palindrome.");
        }
        else {
            System.out.println(initialNum + " is not palindrome.");
        }
    }
}
