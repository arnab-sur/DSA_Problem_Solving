//Fibonacci Numbers are ( 0 indexed )
// 0,1,1,2,3,5,8,13,21,34,55,89,144,.....
// Fibonacci(9) = 34

import java.util.Scanner;
public class FibonacciNumber {
    static int getFibonacciNumber(int n) {
        if(n<=1)
            return n;
        else
            return getFibonacciNumber(n-1) + getFibonacciNumber(n-2);       //Using recursion
    }

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("The " + i + " no. fibonacci number is : " + getFibonacciNumber(i));
    }
}
