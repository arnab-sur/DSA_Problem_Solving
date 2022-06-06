//Armstrong Number: if the digits of a number is multiplied by itself for n times,
//Where n is the no. of digits of the number, are added together and their sum is equals to the number itself
//then it is Armstrong Number.
//Ex: 153 = 1*1*1 + 5*5*5 + 3*3*3   no. of digits, n=3

import java.util.Scanner;
public class ArmstrongNumber {
    static boolean isArmstrongNumber(int num) {
        int number = num, n=0, sum=0;
        //find no. of digits i.e n
        while(num>0){
            num /=10;
            n++;
        }
        num = number;
        for(int i=0; i<n; i++) {
            sum += Math.pow(number%10, n);  //Multiply each digit n times and add them
            number /= 10;
        }
        return sum==num;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Is " + num + " an Armstrong Number? " + isArmstrongNumber(num));
    }
}
