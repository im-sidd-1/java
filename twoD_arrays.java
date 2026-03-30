import java.util.*;

public class twoD_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // scanner class 

        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt(); // taking ip for how many rows 

        System.out.print("Enter no. of columns: ");
        int cols = sc.nextInt(); // inp for cols 

        int[][] num = new int[rows][cols];   // creating an array 
        // inout of numbers in the matrix 
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                num[i][j]=sc.nextInt();      // taking inp in the array 
            }
        }

        
        System.out.println("Here is your matrix: - ");
        // for o/p: - 
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

    }
}
