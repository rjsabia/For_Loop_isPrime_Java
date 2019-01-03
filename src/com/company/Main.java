package com.company;

public class Main {

    public static void main(String[] args) {

        //System.out.println("$10,0000 at 2% interest is $" + calculateInterest(10000.0, 2.0));
        //loopCalcInterest(10000, 2);

        // course loop solution
        // increase interest
        for(int i=2; i<9; i++) {
            System.out.println("$10,0000 at " + i + "% interest is $" + String.format("%.2f",
                    calculateInterest(10000, i)));
        }

        System.out.println("************************");

         // decrease interest
        for(int i=8; i>1; i--) {
            System.out.println("$10,0000 at " + i + "% interest is $" + String.format("%.2f",
                    calculateInterest(10000, i)));
        }

        int count = 0;

        for(int i=10; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    // my loop example

//    public static double loopCalcInterest(double amount, double interestRate) {
//        for(int i = 0; i < 7; i++){
//            double interest = (amount * (interestRate/100));
//            System.out.println("With $" + amount + " at " + interestRate
//            + "% interest would be $" + interest);
//            interestRate++;
//        }
//        return interestRate;
//    }

    // simple interest calc
    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }

    // calculate prime number

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }
        // could also use i <= Math.sqrt(n);
        for(int i=2; i <= n/2; i++) {

            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
