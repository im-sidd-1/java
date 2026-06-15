import java.util.Arrays;
public class quick_Sort {
     static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        //swap 
        if(low<pivot){
        int temp = arr[low];
        arr[low] = pivot;
        pivot = temp;
        }
        return 1;
    }

    static void quicksort(int[] arr,int low,int high){
        if(low<high){
        int pivot = partition(arr,high,low);
        quicksort(arr, low, pivot-1);
        quicksort(arr, pivot+1, high);
        }
    }
    public static void main(String[] args) {
        int high = 0;
        int low = 0;
        int[] arr = {4,5,8,1,2,9,6,3,7};
        quicksort(arr,low,high);

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
