// T.C = In Worst case: O(n^2) and In Average Case: O(nlog(n))
// Worst case occurs when pivot is always the smallest or the largest element. In this case we prefer Merge Sort.
// But in Quick Sort we do not have to use any extra space like Marge Sort. So, S.C = O(1)
// And these worst case condition comes very less. So depending on the average case, Quick Sort is useful.

public class Quick_Sort {
    static void printArray(int arr[]) {
        System.out.print("The Array is : ");
        for(int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  //we take the last element of the array as pivot.
        int i = low-1;

        for(int j=low; j<high; ++j) {
            if(arr[j]<pivot) {
                i++;
                //swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        //swap to fix the position of pivot
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;       //Pivot index
    }

    static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;
        System.out.println("Before Sorting: ");
        printArray(arr);
        quickSort(arr, 0, n-1);
        System.out.println("After Quick Sort: ");
        printArray(arr);
    }
}
