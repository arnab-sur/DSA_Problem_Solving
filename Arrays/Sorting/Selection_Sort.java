//T.C = O(n^2) and S.C = O(1)
public class Selection_Sort {
    static void printArray(int arr[]) {
        System.out.print("The Array is : ");
        for(int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
    }

    static void selectionSort(int[] arr) {
        if(arr.length<=1)
            return;

        for(int i=0; i<arr.length; ++i) {
            int minimum_index = i;
            for(int j=i+1; j<arr.length; ++j) {
                if(arr[j]<arr[minimum_index]) { //< is for ascending order
                    //we may use arr[j]>arr[minimum_index] for descending order
                    minimum_index = j;
                }
            }
            if(minimum_index != i) {
                int temp = arr[minimum_index];
                arr[minimum_index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {12,1,8,3,-5,21,4};
        System.out.println("Before sorting: ");
        printArray(a);
        selectionSort(a);
        System.out.println("After Selection Sort: ");
        printArray(a);
    }
}
