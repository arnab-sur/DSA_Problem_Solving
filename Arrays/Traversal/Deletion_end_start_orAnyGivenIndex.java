//An array of length 5, arr[] = [1,2,3,4,5] is given.
//Delete number at the end, start, or any given index.
//We can not increase the length of the array in java, so the numbers will be replaced here.

import java.util.Scanner;
public class Deletion_end_start_orAnyGivenIndex {
    //Print
    static void print(int arr[]) {
        System.out.print("The Array is : ");
        for(int i=0; i<arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    //delete at the start
    static void deleteAtStart(int arr[]) {
        int[] a = new int[arr.length-1];
        for(int i=0, j=0; i< arr.length-1; ++i) {
            a[i] = arr[++j];
        }
        print(a);
    }
    //delete at a given index
    static void deleteAtIndex(int arr[], int index) {
        if(arr==null || index<0 || index>arr.length) {
            return;
        }
        int[] a = new int[arr.length-1];
        for(int i=0, j=0; i<arr.length; ++i) {
            if(i==index) {
                continue;
            }
            a[j++] = arr[i];    //copy the value at j th index then increment j
        }
        print(a);
    }
    //delete at the end
    static void deleteAtEnd(int arr[]) {
        int[] a = new int[arr.length-1];
        for(int i=0; i< arr.length-1; ++i) {
            a[i] = arr [i];
        }
        print(a);
    }

    public static void main(String[] args) {
        //Declare and initialise arr
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("After deleting 1st element from arr : ");
        deleteAtStart(arr);
        System.out.print("Enter the index : ");
        int i = sc.nextInt();
        System.out.println("After deleting number from arr at index " + i + " : ");
        deleteAtIndex(arr, i);
        System.out.println("After deleting the last element from arr : ");
        deleteAtEnd(arr);
    }
}
