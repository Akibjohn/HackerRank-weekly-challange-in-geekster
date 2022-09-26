// Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].

// Print "true" if there is a 132 pattern in nums, otherwise, print "false".

// Input Format

// Take integer n.
// Then, take integer array of size n
// Constraints

// n == nums.length
// 1 <= n <= 2 * 10^5
// -10^9 <= nums[i] <= 10^9
// Output Format

// Print "true" or "false"
// Sample Input 0

// 4
// 3 1 4 2
// Sample Output 0

// true
// Explanation 0

// The possible case here is [1,4,2]. Hence, we can return true for this case



import java.util.*;

public class ques2 {
    public static Scanner input = new Scanner(System.in);
    
    public static void input(int[] arr){
        for(int i=0;i<arr.length;i++) arr[i]=input.nextInt();
    }
    
    public static boolean pattern(int[] arr){
        for(int i=0;i<arr.length-2;i++){
             if(arr[i] < arr[i+1] && arr[i+1] > arr[i+2]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=input.nextInt();
        int[] arr = new int[n];
        input(arr);
        System.out.println(pattern(arr));
    }
}