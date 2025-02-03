import java.util.Scanner;

public class ques_17 {
    public static void main(String[] args) {
        System.out.println("check factorail of a number");
        //factorial (5) = 5*4*3*2*1
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        for(int i = 1; i<=num; i++){
            fact = fact*i;
        }

        System.out.println("Factorial of "+num + " : " +fact);
    }
}
