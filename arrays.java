import java.util.*;
public class arrays {
    public static void main(String[] args) {
        // take input from the user and make it in a array : - 
        Scanner sc = new Scanner(System.in);
        int sizeofarray= sc.nextInt();
        int num[]=new int[sizeofarray];
 
        //taking ip
        for(int i=0;i<sizeofarray;i++){
            num[i]=sc.nextInt();            
        }
        //op
        for(int i=0;i<sizeofarray;i++){
            System.out.println(num[i]);
        }
    }
}
