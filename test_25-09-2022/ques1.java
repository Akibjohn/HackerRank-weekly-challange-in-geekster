// Multiplication of Two Matrices

// Two friends Ankit and Deepanshu are having two matrices of size m1*n1 and m2*n2 respectively. Both of them are good at mathematics and they wondering how we can multiply the matrices. Your task is to help both of them in multiplication of matrices.

// Print the final matrix after the multiplication.

// Print "-1" if the multiplication is not possible.

// Note: Multiplication of two matrices is only possible when n1==m2.

// Input Format

// Two integers m1 and n1 depicting the size of first matrix.
// m1*n1 Integers depicting the elements of first matrix.
// Two integers m2 and n2 depicting the size of first matrix.
// m2*n2 Integers depicting the elements of first matrix.
// Constraints

// 1<=m1,n1,m2,n2<=100
// -1000<=mat[i][j]<=1000
// Output Format

// A matrix of size m1*n2.

// Sample Input 0

// 3 2
// 1 2 3
// 4 5 6
// 2 3
// 1 2
// 3 4
// 5 6
// Sample Output 0

// 9 12 15 
// 19 26 33 
// 29 40 51 





import java.util.*;

public class ques1 {
    public static Scanner input=new Scanner(System.in);
    
    public static void input2d(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
    }
    
    public static void print2d(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixMultiplication(int[][] A, int[][] B) {
        int n = A.length, m = A[0].length, p = B.length, q = B[0].length;
        if (m != p)
            return null;

        int[][] ans = new int[n][q];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                int res = 0;
                for (int k = 0; k < m; k++) {
                    res += A[i][k] * B[k][j];
                }
                ans[i][j] = res;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=input.nextInt();
        int m=input.nextInt();
        int[][] arr1=new int[n][m];
        input2d(arr1);

        int n1=input.nextInt();
        int m1=input.nextInt();
        int[][] arr2=new int[n1][m1];
        input2d(arr2);
        
        int[][] ans = matrixMultiplication(arr1, arr2);
        if(ans != null){
            print2d(ans);
        }
        else{
            System.out.println(-1);
        }
       
    }
}