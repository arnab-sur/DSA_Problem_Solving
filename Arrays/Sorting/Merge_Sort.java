//Divide and Conquer
//T.C = O(nlog(n) and S.C = O(n)
public class Merge_Sort {
    static void printArray(int arr[]) {
        System.out.print("The Array is : ");
        for(int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
    }

    static void conquer(int[] arr, int start, int mid, int end) { //for conquer part T.C = O(n)
        int[] mergedArray = new int[end-start+1];
        int index1 = start, index2 = mid+1, x=0;

        while(index1 <= mid && index2 <= end) {
            if(arr[index1] <= arr[index2]) {
                mergedArray[x] = arr[index1];
                x++;
                index1++;
            }
            else {
                mergedArray[x] = arr[index2];
                x++;
                index2++;
            }
        }

        while(index1 <= mid) {
            mergedArray[x++] = arr[index1++];
        }
        while (index2 <= end) {
            mergedArray[x++] = arr[index2++];
        }

        for(int i=0, j=start; i<mergedArray.length; ++i, ++j) {
            arr[j] = mergedArray[i];
        }
    }

    static void divide(int[] arr, int start, int end) {   //for divide part T.C = O(log(n))
        if(start>=end)
            return;

        int mid = start + (end-start)/2;  //we can use this instead of (start+end)/2,
        // as if these are very large numbers then there may be an issue of space
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquer(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int[] a = {6,3,9,5,2,8};
        printArray(a);
        int n = a.length;
        divide(a, 0, n-1);
        System.out.println("After Merge Sort: ");
        printArray(a);
    }
}