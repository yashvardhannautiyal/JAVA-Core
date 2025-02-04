import java.util.Scanner;

public class ques_20 {
    public static void main(String[] args) {
        System.out.println("Write a program to find the sum of digits of a number using a while loop.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int sum = 0;

        while(num>0){
            int digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.println("Sum of all the digits : "+sum);

    }
}
