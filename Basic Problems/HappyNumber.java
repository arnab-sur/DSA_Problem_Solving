/*  Leetcode: 202
A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */

import java.util.Scanner;
public class HappyNumber {
    //using two pointer approach
    static boolean isHappyNumber(int num) {
        int slow, fast;
        slow = fast = num;

        do {
            slow = getNextValue(slow); //jump by only 1 position
            fast = getNextValue(getNextValue(fast)); //jump by 2 positions
        } while (slow != fast);

        return slow == 1;
    }

    private static int getNextValue(int val) {
        int squareSum = 0;
        while(val>0) {
            int temp = val%10;
            squareSum += temp*temp;
            val /= 10;
        }
        return squareSum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Is "+ num + " a Happy Number?   " + isHappyNumber(num));
    }
}
