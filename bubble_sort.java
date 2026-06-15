import java.util.Scanner;
public class bubble_sort {
    public static void main(String[] args) {
        //Scanning an array ;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of elements in the array - ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        //taking ip in array 
        System.out.print("Enter the elements in the array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //bubble sort
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Here is your sorted array - ");

        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

