package AH3;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter your number");
//        fizzbuzz(console.nextInt());
        fizzBuzzRecursive(console.nextInt());
    }
    private static void fizzbuzz(int n){
        int m = 1;
        while(m <= n){
            if(m % (3*5) == 0){
                System.out.println("FizzBuzz");
            }else if (m % 3 == 0){
                System.out.println("Fizz");
            }else if (m % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(m);
            }
            m++;
        }
    }

    private static void fizzBuzzRecursive(int n){
        if ( n <= 1) {
            System.out.print(1);
        }else {
            fizzBuzzRecursive(n-1);
            if(((n) % (3*5)) == 0){
                System.out.println("FizzBuzz");
            }else if (n % 3 == 0){
                System.out.println("Fizz");
            }else if (n % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(n);
            }
        }
    }
}
