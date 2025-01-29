import java.util.Scanner;

public class ques_10 {
    public static void main(String[] args) {
        System.out.println("Find the smallest of three numbers using if-else.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = sc.nextInt();

        if(num1 <= num2 && num1 <= num3){
            System.out.println(num1 + " is the smallest.");
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2 + " is the smallest.");
        }
        else if(num3 <= num1 && num3 <= num2){
            System.out.println(num3 + " is the smallest.");
        }
    }
}
