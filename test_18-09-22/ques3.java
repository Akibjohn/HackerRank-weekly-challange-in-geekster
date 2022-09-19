// Given a sorted array with repeating integers. You need to find the first occurence , last occurence and count of a given key in the array. USE ONLY BINARY SEARCH. Your algorithm should run in LogN time.If element is not present print -1 -1 0.

// Input Format

// First line contains N , then N integers in next line , then key in the next line.

// Constraints

// N<=1000000

// Output Format

// 3 space separated integers for lower bound , upper bound and count/frequency of that key.

// Sample Input 0

// 6

// 1 2 2 2 3 4

// 2
// Sample Output 0

// 1 3 3
// Explanation 0

// First occurence of 2 is at 1. Second Occurence of 2 is at 3. Count is 3.







import java.util.*;

public class ques3 {
    
    public static Scanner input=new Scanner(System.in);
    
    public static void input(int[] arr){
        for(int i=0;i<arr.length;i++) arr[i]=input.nextInt();
    }
    
    public static int firstOccur(int[] arr, int target){
        int s=0, e=arr.length-1, ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans=mid;
                e=mid-1;
            }else if(arr[mid]<target){
                s=mid+1;
            }else if(arr[mid]>target){
                e=mid-1;
            }
        }return ans;
        
    }
    
    public static int lastOccur(int[] arr,int target){
        int s=0, e=arr.length-1, ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans=mid;
                s=mid+1;
            }else if(arr[mid]<target){
                s=mid+1;
            }else if(arr[mid]>target){
                e=mid-1;
            }
        }return ans;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=input.nextInt();
        int[] arr=new int[n];
        input(arr);
        int target=input.nextInt();
        int first=firstOccur(arr,target);
        int last=lastOccur(arr,target);
        System.out.print(first+" ");
        System.out.print(last+" ");
        if(first==-1 && last==-1){
            System.out.print((0));
        }else if(first==last){
            System.out.print((1));
        }else{
            System.out.print((last-first+1));
        }
        
    }
}