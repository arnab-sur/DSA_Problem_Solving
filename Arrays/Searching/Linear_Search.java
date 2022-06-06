//An array a = [12, 56, 34, 90, 82, 45] is given. Implement Linear Search operation.
//Brute-force approach. T.C = O(n), S.C = O(1)

import java.util.Scanner;
public class Linear_Search {
    static void isPresent(int arr[], int num) {
        int i = 0; boolean flag = false;
        for(i=0; i<arr.length; ++i) { //search every element from index 0 until num is found
            if(num == arr[i]) {
                System.out.println(num + " is present at index " + i);
                flag = true;
                break;
            }
        }
        if(flag == false)
            System.out.println(num + " is not present in the array.");
    }

    public static void main(String[] args) {
        int[] a = {12, 56, 34, 90, 82, 45};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        isPresent(a, n);
    }
}
