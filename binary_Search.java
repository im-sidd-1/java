public class binary_Search {
    // implementing iterative binary search - 
    public static int binarySearch(int[] arr,int target){
        //we define start and end 
        int start = 0;
        int end = arr.length-1;
        int mid;
        String  c = "Number doesnt exit in the array";
        while(start<=end){
            mid = (start+end)/2; // we use mid=(start+end)/2 to prevent overflow 
            if(target>arr[mid]){
                start = mid +1;
            }else if(target<arr[mid]){
                end = mid -1;
            }else return mid+1;
        }
        
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {90,9,48,5,8,1,9,32,9,49,5};
        //sorting the array - largest element goes to the end of the array 
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        System.out.print("here is the sorted array - ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            // System.out.println("the target is 48");
            int target = 48;
            // int result = binarySearch(arr, target);
            // System.out.println(result);
            System.out.println("  ");
            System.out.print("The position is ");
            // System.out.println("The index  is ");
            System.out.println(binarySearch(arr,target));
        System.out.println("  ");

    }
}
