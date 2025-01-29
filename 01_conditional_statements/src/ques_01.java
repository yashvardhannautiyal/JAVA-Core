import java.util.Scanner;

public class ques_01 {
    public static void main(String[] args) {
        System.out.println("Write a program to check if a number is even or odd.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is Even.");
        } else if (num % 2 == 1) {
            System.out.println(num + " is Odd.");
        }

    }
}
