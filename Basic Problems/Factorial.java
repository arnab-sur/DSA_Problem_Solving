// factorial(n) = factorial(1)*2*3*4*......n = n*factorial(n-1)    factorial(1) = 1
//factorial(5) = factorial(1)*2*3*4*5 = 5*factorial(4)

import java.util.Scanner;
public class Factorial {
    static int getFactorial(int n) {
        if(n==1)
            return 1;
        else
            return n * getFactorial(n-1);       //Using recursion
    }

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Factorial of "+ i +" is = "+ getFactorial(i));
    }
}