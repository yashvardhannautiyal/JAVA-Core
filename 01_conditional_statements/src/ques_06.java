import java.util.Scanner;

public class ques_06 {
    public static void main(String[] args) {
        System.out.println("Create a simple calculator using a switch statement.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter number 2 : ");
        float num2 = sc.nextFloat();
        System.out.println("Operations :\n + \n - \n * \n / \n %");
        System.out.print("Enter operation ");
        char ope = sc.next().charAt(0);

        float num3;

        switch(ope){
            case '+' :
                num3 = num1+num2;
                System.out.println("Sum : "+ num3);
                break;

            case '-' :
                num3 = num1 - num2;
                System.out.println("Difference : "+num3);
                break;

            case '*' :
                num3 = num1*num2;
                System.out.println("Product : "+num3);
                break;

            case '/' :
                num3 = num1/num2;
                System.out.println("Dividend : "+num3);
                break;

            case '%' :
                num3 = num1%num2;
                System.out.println("Modulus : "+num3);
                break;

            default:
                System.out.println(ope + " is not valid operation.");
        }

    }
}
