import java.util.Scanner;

public class ques_07 {
    public static void main(String[] args) {
        System.out.println("Write a program to determine whether a number is positive, negative, or zero.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        }
        else if(num == 0){
            System.out.println(num + " is zero.");
        }
    }
}
