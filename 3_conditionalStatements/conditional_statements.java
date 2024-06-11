import java.util.*;

public class conditional_statements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if (age > 18){
        //     System.out.println("Adult");
        // }else{
        //     System.out.println("Not adult");
        // }

        // EVEN ODD 
        // int x = sc.nextInt();
        // if(x%2 == 0){
        //     System.out.println(x + " " + "is an even number");
        // }
        // else if(x%2 == 1){
        //     System.out.println(x + " " + "is an odd number");
        // }


        // -----------Practise-----------------
        // 1.Print all even numbers till n 
         int n = sc.nextInt();
         int i = 0;
         do{
             if(i%2 == 0){
                 System.out.println(i);
             }
            
             i++;
         }while(i < n);
     }

   
}
