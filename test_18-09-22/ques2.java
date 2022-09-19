// Given an integer array of size n, Write a program to print the minimum number of moves required to make all array elements equal. Given the constraint that :

// In one move, we can increment or decrement an element of the array by 1.
// Input Format

// Line 1 : Take input size n
// Line 2 : Take input array elements
// Constraints

// 1 <= n <= 10^4
// 0 <= arr[i] <= 10^6
// Output Format

// Single Line Output (minimum number of moves)

// Sample Input 0

// 3
// 2 3 1
// Sample Output 0

// 2
// Explanation 0

// Only two moves are needed (each move either increments or decrements one element):

// [2,3,1] => [2,2,1] => [2,2,2] (Now all elements are equal)




import java.util.*;

public class ques2 {
    public static Scanner input=new Scanner(System.in);

    public static void input(int[] arr){
        for(int i=0;i<arr.length;i++) arr[i]=input.nextInt();
    }
    
    public static int minMoves2(int[] arr) {
        Arrays.sort(arr);
        int count= 0;
        int mid = arr[arr.length/2];
        for (int val: arr) count+= Math.abs(mid - val);
        return count;
    }
    
    public static void main(String[] args) {
        int n = input.nextInt();
        int[] arr = new int[n];
        input(arr);
        System.out.print(minMoves2(arr));
    }
}