// Lucky Numbers

// Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

// Print all the lucky integers in the array in sorted order. If there is no lucky integer print -1.

// Input Format

// First line of input contains integer n denoting the size of array.
// Next line of input contains n space separated integers denoting the elements of array.
// Constraints

// 1<=n<=1000
// 1<=arr[i]<=1000
// Output Format

// Print the all lucky integer in the array. If there is no lucky integer print -1.
// Sample Input 0

// 7
// 2 2 3 1 3 4 3
// Sample Output 0

// 1 2 3
// Explanation 0

// 1 is occurring 1 times, 2 is ocurring two times and 3 is ocurring three times.
// 1 2 and 3 is printed in sorted order.
// Sample Input 1

// 5
// 1 2 3 4 5
// Sample Output 1

// 1



import java.util.*;

public class ques4 {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void input(int[] arr){
        for(int i=0;i<arr.length;i++) arr[i]=input.nextInt();
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n= input.nextInt();
        int[] arr = new int[n];
        input(arr);
        int[] freq= new int[1002];
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i: arr) freq[i]++;
        for(int i=1;i<freq.length;i++){
            if(freq[i]==i) al.add(i); 
        }
        if(al.isEmpty()) {
            System.out.println("-1");
            return;
        }
        for(int i: al) System.out.print(i+" ");
    }
}