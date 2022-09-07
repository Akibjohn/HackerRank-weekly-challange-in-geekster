// Sort The Complete Matrix

// Take a 2-D array of size m*n as input.

// Print the Matrix in a order such that all the elements present in Matrix are sorted in nature.

// Note: You are free to use inbuilt sort function.

// Input Format

// Integer m and n, depicting the dimension of 2-D array.
// m*n integers, depicting the elements of the array.
// Constraints

// 1<=m,n<=1000
// 1<=mat[i][j]<=1000
// Output Format

// A Matrix of size m*n.
// Sample Input 0

// 3 3
// 9 8 7 
// 5 4 1 
// 2 3 6
// Sample Output 0

// 1 2 3 
// 4 5 6 
// 7 8 9 

import java.util.*;

public class ques2 {
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
    
    public static int[][] sortMatrix(int[][] matrix){
        int n=matrix.length,m=matrix[0].length;
        int[] arr=new int[n*m];
        int count=0;
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                arr[count++]=matrix[r][c];   
            }
        }
        Arrays.sort(arr);
        count=0;
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                matrix[r][c]=arr[count++];   
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=input.nextInt();
        int m=input.nextInt();
        int[][] matrix=new int[n][m];
        input(matrix);
        print(sortMatrix(matrix));
        
    }
}