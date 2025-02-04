import java.util.Scanner;

public class ques_19 {
    public static void main(String[] args) {
        System.out.println("Print Fibonacci series up to n terms using loops.");
//        fibonacci series  ( num = sum of previous two numbers )

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Fibonacci series you want : ");
        int num = sc.nextInt();

        int firstNum = 0;
        int secondNum = 1;
        System.out.print("Fibonacci series : " + firstNum + " " + secondNum  + " ");

        for (int i =2; i<num; i++){
            int fibNum = firstNum + secondNum;
            System.out.print(fibNum + " ");
            firstNum = secondNum;
            secondNum = fibNum;
        }

    }
}
