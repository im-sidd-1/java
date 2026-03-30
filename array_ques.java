import java.util.*;
public class array_ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows - ");
        int rows = sc.nextInt();
        System.out.print("enter number of columns - ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the values in the matrix - ");
        for(int i=0;i<rows;i++){             //taking i/p in matrix
            for(int j=0;j<cols;j++){
            matrix[i][j] = sc.nextInt();
        }
    }
// searching for the number in the matrix 
        System.out.println("Which number do you want to find? ");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){             //taking i/p in matrix
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==x){
                    System.out.println(i+1 +" "+ j+1);    
            }
        }
    }

    }
}
