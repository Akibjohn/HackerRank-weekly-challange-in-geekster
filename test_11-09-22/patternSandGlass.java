
import java.util.*;

public class patternSandGlass {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        for(int i = n; i > 0; i--){
            for(int k = n-i; k >= 1; k--)
                System.out.print(" ");
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= n-i; k++)
                System.out.print(" ");
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
    
}