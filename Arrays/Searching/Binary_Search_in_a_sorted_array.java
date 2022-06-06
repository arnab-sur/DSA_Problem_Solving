//A sorted array a = [12, 34, 45, 82, 89] is given. Implement Binary Search operation.

import java.util.Scanner;
public class Binary_Search_in_a_sorted_array {
    static int isExist(int arr[], int num, int start, int end) {
        if(end>=start) {
            int mid = (start+end)/2;
            if(arr[mid]==num) {
                return mid;
            }
             else if(arr[mid]>num) {
                return isExist(arr, num, start, mid-1); //search in the left Subarray
            }
            else {
                return isExist(arr, num, mid+1, end); //search in the right Subarray
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {12, 34, 45, 82, 89};
        int start=0, end=a.length-1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int result = isExist(a, n, start, end);
        if(result == -1) {
            System.out.println(n+ " is not present in the array.");
        }else {
            System.out.println(n+ " is present at index " + result);
        }
    }
}
