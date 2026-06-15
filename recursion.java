import java.util.Scanner;
public class recursion {
    public static void loop(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        loop(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        loop(n);
    }
}
