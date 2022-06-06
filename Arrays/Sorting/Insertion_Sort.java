//T.C = O(n^2 and S.C = O(1)
public class Insertion_Sort {
    static void printArray(int arr[]) {
        System.out.print("The Array is : ");
        for(int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
    }

    static void insertionSort(int[] arr) {
        int i,j,key;
        if(arr.length<=1)
            return;
        for(i=1; i<arr.length; ++i) {
            key = arr[i];
            for(j=i-1; j>=0 && key<arr[j]; --j) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] a = {12,3,-7,21,4,16};
        System.out.println("Before sorting: ");
        printArray(a);
        insertionSort(a);
        System.out.println("After Insertion Sort: ");
        printArray(a);
    }
}
