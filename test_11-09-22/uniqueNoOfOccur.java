

// Take an array of integers arr as input from user and print "true" if the number of occurrences of each value in the array is unique, else print "false".

// Input Format

// An Integer N.
// N integers depicting elements of array.
// Constraints

// 1 <= arr.length <= 10^5
// -10^9 <= arr[i] <= 10^9
// Output Format

// "true" or "false"
// Sample Input 0

// 6
// 1 2 2 1 1 3
// Sample Output 0

// true
// Explanation 0

// The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

// Sample Input 1

// 4
// 1 2 1 2
// Sample Output 1

// false






import java.util.*;

public class uniqueNoOfOccur {
    public static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        HashMap<Integer, Integer> hm=new HashMap<>();
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=input.nextInt();
        
        for(int i : arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int[] ans=new int[hm.size()];
        int idx=0;
        for(int key: hm.keySet()){
            ans[idx++]=hm.get(key);
        }
        boolean flag=true;
        for(int i=1;i<ans.length;i++){
            if(ans[i-1]==ans[i]){
                flag=false;
            }
        }
        System.out.print(flag);
        
        
    }
}