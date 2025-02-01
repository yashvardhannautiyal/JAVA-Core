import java.util.Scanner;

public class ques_12 {
    public static void main(String[] args) {
        System.out.println("Print the multiplication table of a given number.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(num + " * " + i + " = "+ num*i);
        }
    }
}
