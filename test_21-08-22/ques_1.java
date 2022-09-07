import java.util.*;
public class ques_1 {
    public static Scanner input=new Scanner(System.in);
    
    public static void input1D(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
    }
    
    public static int trapWater(int[] arr){
        int n=arr.length;
        int ans = 0;
        int[] lMax = new int[n];
        lMax[0] = arr[0];
        for(int i = 1 ; i < n ; i++){
            lMax[i] = Math.max(arr[i] , lMax[i-1]);
        }
        int[] rMax = new int[n];
        rMax[n-1] = arr[n-1]; 
        for(int i = n-2 ; i >= 0 ; i--){
            rMax[i] = Math.max(arr[i] , rMax[i+1]);
        }
        
        for(int i = 0 ; i < n ; i++){
            ans += Math.min(lMax[i] , rMax[i]) - arr[i];
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=input.nextInt();
        int[] arr=new int[n];
        input1D(arr);
        System.out.println(trapWater(arr));
    }
}
