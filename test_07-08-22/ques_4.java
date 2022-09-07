import java.util.*;
public class ques_1{
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

    public static void swap(int[][] arr, int i_1, int j_1, int i_2, int j_2) {
        int temp = arr[i_2][j_2];
        arr[i_2][j_2] = arr[i_1][j_1];
        arr[i_1][j_1] = temp;

    }

    public static void swapCol(int[][] arr, int c1, int c2) {
        for (int r = 0; r < arr.length; r++) {
            swap(arr, r, c1, r, c2);
        }
    }
    public static int[][] transpose(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = r + 1; c < arr[0].length; c++) {
                swap(arr, r, c, c, r);
            }
        }
        return arr;

    }

    public static void reverseMatrxi(int[][] arr){
        transpose(arr);
        int n=arr[0].length,i=0,j=n-1;
        while(i<j){
            swapCol(arr, i++, j--);
        }

    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        input2d(arr);
        // transpose(arr);
        reverseMatrxi(arr);
        print2d(arr);
    }
}