// You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).

// Note: Change in the input array/list itself. You don't need to return or print the elements.
// Input Format

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.

// Third line contains the value of 'D' by which the array/list needs to be rotated.

// Constraints

// 0 <= N <= 10^6 0 <= D <= N

// Output Format

// print the rotated array/list in a row separated by a single space.

// Sample Input 0

// 7
// 1 2 3 4 5 6 7
// 2
// Sample Output 0

// 3 4 5 6 7 1 2
// Sample Input 1

// 7
// 1 2 3 4 5 6 7
// 0
// Sample Output 1

// 1 2 3 4 5 6 7






import java.util.*;

public class ques1 {
    public static Scanner input=new Scanner(System.in);
    
    public static void input1D(int[] arr){
        for(int i=0;i<arr.length;i++) arr[i]=input.nextInt();
    }
    public static void swap(int[] arr, int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    public static int[] rotateArrayClock_01(int[] arr, int k) {
        int n = arr.length, idx = n - k;
        k%=n;
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[idx % n] = arr[i];
            idx++;

        }return ans;
    }
    public static void print1D(int[] arr){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=input.nextInt();
        int[] arr =new int[n];
        input1D(arr);
        int target=input.nextInt();
        print1D(rotateArrayClock_01(arr , target));
    }
}