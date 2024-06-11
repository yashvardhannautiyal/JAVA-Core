// Functions 
// 1. multiply two numbers 

import java.util.*;

public class functions {
// -----------------------1. multiply two numbers --------------------
    // public static int multiply(int a, int b){
    // return a*b;
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int result = multiply(a,b);
    // System.out.println("Result : "+ result);
    // }





    //---------------------- 2. Factorial of a number------------------------------

    // public static void fact(int num) {
    //     int fact = 1;
    //     if (num < 0) {
    //         System.out.println("Invalid number");
    //     } 
    //         for (int i = num; i >= 1; i--) {
    //             fact = fact * i;
    //         }
    //         System.out.println("Factorial : " + fact);       
    //     return;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int num = sc.nextInt();
    //     fact(num);
    // }



    //---------------------------- 3.Number is prime -----------------------------------
//all numbers other than power of 3(other than 3 itself) + power of 2(other than 2 itself) are prime numbers

     public static boolean prime(int num){
         if(num <= 1){
             return false; // 1 is not a prime number
         }
         if(num == 2){
             return true; // 2 is only even prime number
         }
         if(num % 2 == 0){
             return false; // all even numbers are non prime
         }
         for(int i = 3; i <= Math.sqrt(num); i+=2){
             //initialize : checks number from 3
             // condition : checks number till sqrt of num till there the prime numbers are available
             //incrememt:  all numbers increment in power of 2
             if(num % i == 0){
                 return false;
             }
         }
         return true;
     }

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         if(prime(num)){
             System.out.println(num +  " " + "is a prime number");
         }
         else{
             System.out.println(num +  " " + "is not a prime number");
         }
         sc.close();
     }


}