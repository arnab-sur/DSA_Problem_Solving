//Check if a number is palindrome or not.
//121 is palindrome but 123 is not

import java.util.Scanner;
public class PalindromeNumber {
    static boolean isPalindrome(int num) {
        int reverseNum = 0, number = num;
        while(num>0) {
            reverseNum = reverseNum*10 + num%10;
            num /= 10;
        }
        return number==reverseNum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Is " + num + " a palindrome number? " + isPalindrome(num));
    }
}
