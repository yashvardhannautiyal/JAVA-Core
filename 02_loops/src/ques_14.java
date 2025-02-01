import java.util.Scanner;

public class ques_14 {
    public static void main(String[] args) {
        System.out.println("Write a program to reverse a number using a while loop.");
//        algorithm
//        Set rev = 0
//        While num > 0{
//        lastDigit = num % 10 -------(34 % 10 = 4)
//        rev = rev * 10 + lastDigit ----------(rev = 0*10 + 4 = 4)
//        num = num / 10  ------------(34 / 10 = 3)
//        } repeat as num = 3 > 0 -> lastDigit = 3 -> rev = 4*10 + 3 -> num = 3/10 = 0
//        print rev

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int rev = 0;

        while(num>0){
            int lastDigit = num%10; // gives last digit of number
            rev = rev * 10 + lastDigit; //adds last digit
            num = num/10; //remove last digit
        }

        System.out.println("Reverse number : "+ rev);


    }
}
