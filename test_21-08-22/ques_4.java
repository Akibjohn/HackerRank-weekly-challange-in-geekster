import java.util.*;

public class ques_4 {
    public static Scanner input = new Scanner(System.in);

    public static void input2d(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
    }

    public static void spiralMat(int[][] arr) {
        int row=arr.length;
        int col=arr[0].length;
        int direction=0;
        int top=0,bottom=row-1;
        int left=0,right=col-1;
        while(left<=right && top<=bottom){
            if(direction==0){
                for(int i=left;i<=right;i++){
                    System.out.print(arr[top][i]+" ");
                }
                direction=1;
                top++;
            }else if(direction==1){
                for(int i=top;i<=bottom;i++){
                    System.out.print(arr[i][right]+" ");
                }
                direction=2;
                right--;
            }
            else if(direction==2){
                for(int i=right;i>=left;i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                direction=3;
                bottom--;
            }
            else if(direction==3){
                for(int i=bottom;i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                }
                direction=0;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] matrix = new int[n][m];
        input2d(matrix);
        spiralMat(matrix);

    }

}