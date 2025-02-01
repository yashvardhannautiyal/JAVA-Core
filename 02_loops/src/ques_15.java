public class ques_15 {
    public static void main(String[] args) {
        System.out.println("Print all prime numbers between 1 and 100.");
//        algo:
//        i. set isPrime = true
//        ii. loop from 2 to n
//        iii. if(n % i == 0 ) {isPrime = false; } break;
//        iv. if(isPrime == true){print n}
//        v. repeat step 2

        for (int n = 2; n<=100; n++){ //loop from 2 to 100 as 1 and 0 are non-prime
            boolean isPrime = true; // set isPrime = true initially

            for(int i = 2; i<n; i++){ // loop till the number itself
                if(n % i == 0){ // checks if number is divisible from any other number till itself
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                System.out.print(n + " ");
            }
        }

        }
    }

