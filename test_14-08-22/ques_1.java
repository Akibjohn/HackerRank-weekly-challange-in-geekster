import java.util.*;
public class ques_1{
    public static Scanner input=new Scanner(System.in);

    public static void input1d(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
    }

    public static void pairSum(int[] arr, int data){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==data) System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        int n=input.nextInt();
        int[] arr=new int[n];
        input1d(arr);
        int data=input.nextInt();
        pairSum(arr, data);
        
    }
}