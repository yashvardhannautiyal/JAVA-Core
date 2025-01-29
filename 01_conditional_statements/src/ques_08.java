import java.util.Scanner;

public class ques_08 {
    public static void main(String[] args) {
        System.out.println("Check whether a person is eligible to vote based on their age.");
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if (age < 0 || age > 150){
            System.out.println("Enter valid age");
        }
        else if(age > 18){
            System.out.println("You are eligible to vote!!");
        } else if (age < 18) {
            System.out.println("You are not eligible to vote!! Grow up!!!");
        }

    }
}
