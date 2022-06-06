//T.C = O(n^2) and S.C = O(1)
public class Bubble_Sort {
    static void printArray(int arr[]) {
        System.out.print("The Array is : ");
        for(int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
    }

    static void bubbleSort(int[] arr) {
        if(arr.length<=1)
            return;

        for(int i=0; i<arr.length-1; ++i) {
            for(int j=0; j<arr.length-1; ++j) {
                if(arr[j] > arr[j+1]) {
                    //Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {12,3,-5,21,4};
        System.out.println("Before sorting: ");
        printArray(a);
        bubbleSort(a);
        System.out.println("After Bubble Sort ");
        printArray(a);
    }
}
