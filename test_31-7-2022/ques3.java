// Count All Palindromic Rows

// Take a 2-D array of size m*n as input and count the number of Palindromic Rows present in the 2-D array.

// Input Format

// Integer m and n, depicting the dimension of 2-D array.
// m*n integers, depicting the elements of the array.
// Constraints

// 1<=m,n<=1000 0<=mat[i][j]<=1000

// Output Format

// An Integer Value.
// Sample Input 0

// 2 3
// 1 2 1 
// 4 5 6
// Sample Output 0

// 1
// Sample Input 1

// 4 3
// 1 2 1 
// 4 5 6
// 3 2 3
// 9 8 7
// Sample Output 1

// 2

import java.util.*;

public class ques3 {
    public static Scanner input=new Scanner(System.in);
    
    public static void input(int[][] m){
        for(int r=0;r<m.length;r++){
            for(int c=0;c<m[0].length;c++){
                m[r][c]=input.nextInt();
            }
        }
    }
    
    public static void print(int[][] m){
        for(int r=0;r<m.length;r++){
            for(int c=0;c<m[0].length;c++){
                System.out.print(m[r][c]+" ");
            }System.out.println();
        }
    }
    
    public static boolean isPalindrom(int[] arr){
        boolean isPalindrom=true;
        int n=arr.length;
        int p1=0,p2=n-1;
        while(p1<p2){
            if(arr[p1++]!=arr[p2--]){
            isPalindrom=false;
            }
            
        }
        return isPalindrom;
    }
    public static int palindromicRow(int[][] matrix){
        int count=0;
        for(int r=0;r<matrix.length;r++){
            if(isPalindrom(matrix[r])==true){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=input.nextInt();
        int m=input.nextInt();
        int[][] matrix=new int[n][m];
        input(matrix);
        System.out.println(palindromicRow(matrix));
    }
}
