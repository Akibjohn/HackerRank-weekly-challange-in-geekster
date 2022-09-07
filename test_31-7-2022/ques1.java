// Sum of Absolute Differences
// Take an array "arr" of size N as input. And print an array "result" of length N such that result[i] is equal to the sum of absolute differences between arr[i] and all the other elements of the array.

// result[i] is equal to sum(|arr[i]-arr[j]|) where 0 <= j < N and j != i.

// Note: Array is 0-indexed.

// Input Format

// An integer N, which is the size of the array.
// N integers, depicting the elements of the array.
// Constraints

// 1<=N<=10^4
// -1000<=arr[i]<=1000
// Output Format

// An array of size N
// Sample Input 0

// 3
// 2 3 5
// Sample Output 0

// 4 3 5
// Explanation 0

// result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4,
// result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3,
// result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5.
// Sample Input 1

// 5
// 1 4 6 8 10
// Sample Output 1

// 24 15 13 15 21



import java.util.*;

public class ques1 {
    
    public static Scanner input=new Scanner(System.in);
    
    public static void input(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
    }
    
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int[] sumOfAbsoluteDiffrence(int[] arr){
        int n=arr.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=arr[i]-arr[j];
                if(num<0){
                    num=num*(-1);
                }
                result[i]+=num;
                num=0;
            }
        }
        return result;
    }
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=input.nextInt();
        int[] arr=new int[n];
        input(arr);
        print(sumOfAbsoluteDiffrence(arr));
        
    }
}