import java.util.Scanner;

public class ques_02 {
    public static void main(String[] args) {
        System.out.println("Create a program to find the largest of three numbers using nested if.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is the greatest.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the greatest.");
        }
        else if(num3 >= num1 && num3 >= num2){
            System.out.println(num3 + " is the greatest.");
        }
    }
}
