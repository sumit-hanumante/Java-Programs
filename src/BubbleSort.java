import java.util.Arrays;

/**
 * Created by sumit.
 *
 * implementation of bubble sort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {23,1,22,3,5,2,5,2,26};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int arr[]){

        boolean isSorted = false;
        int lastSortedIndex = arr.length-1;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < lastSortedIndex; i++){
                if (arr[i]> arr[i+1]){
                    isSorted = false;
                    swap(arr,i,i+1);
                }
            }
        }
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
