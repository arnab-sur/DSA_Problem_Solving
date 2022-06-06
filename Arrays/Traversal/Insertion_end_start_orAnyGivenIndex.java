//An array of length 5, arr[] = [1,2,3,4,5] is given.
//Insert number at the end, start, or any given index.
//We can not increase the length of the array in java, so the numbers will be replaced here.

import java.util.Scanner;
public class Insertion_end_start_orAnyGivenIndex {
    //Print
    static void print(int arr[]) {
        System.out.print("The Array is : ");
        for(int i=0; i<arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    //Insert number at the start
    static void insertAtStart(int arr[], int num) {
        for(int i=arr.length-1; i>0; --i) {
            arr[i] = arr[i-1];
        }
        arr[0] = num;
        System.out.println("\n" + num + " is inserted at the start...");
    }
    //Insert number at a given index
    static void insertAtIndex(int arr[], int index, int num) {
        for(int i=arr.length-1; i>index; --i) {
            arr[i] = arr[i-1];
        }
        arr[index] = num;
        System.out.println("\n" + num + " is inserted at index "+ index);
    }
    //Insert number at the end
    static void insertAtEnd(int arr[], int num) {
        arr[arr.length-1] = num;
        System.out.println("\n" + num + " is inserted at the end...");
    }

    public static void main(String[] args) {
        //Declare and initialise arr
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        print(arr);
        System.out.print("Enter the number you want to insert at the start : ");
        int start = sc.nextInt();
        insertAtStart(arr, start);
        print(arr);
        System.out.print("Enter the index : ");
        int i = sc.nextInt();
        System.out.print("Enter the number you want to insert at index " + i + " : ");
        int numb = sc.nextInt();
        insertAtIndex(arr, i, numb);
        print(arr);
        System.out.print("Enter the number you want to insert at the end : ");
        int n = sc.nextInt();
        insertAtEnd(arr, n);
        print(arr);
    }
}
