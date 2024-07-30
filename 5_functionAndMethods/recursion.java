//Reacursion : when a function call itself and perform function
public class recursion {
    static int factorial(int a){
        if(a==1 || a==0){
           return 1;
        }
        else{
            return a*factorial(a-1);
        }
    }


    public static void main(String[] args){
        System.out.println("Factorial of 5 is " + factorial(5));
    }
}
