import java.util.Scanner;

public class ques_18 {
    public static void main(String[] args) {
        System.out.println("write a program to calculate number of digits in a number");

        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;

        while(num>0){
            num = num/10;
            count = count + 1;
        }

        System.out.println("Number of digits : "+count);
    }
}
