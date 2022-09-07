// Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

// Since the result may be very large, so you need to return a string instead of an integer.

// Input Format

// You will be give a Integer array.

// Constraints

// 1 <= nums.length <= 100

// 0 <= nums[i] <= 10^9

// Output Format

// Print the largest number in form of string.

// Sample Input 0

// 10 2
// Sample Output 0

// 210
// Explanation 0

// Input: nums = [10,2]

// Output: "210"

// Sample Input 1

// 3 30 34 5 9
// Sample Output 1

// 9534330



import java.io.*;
import java.util.*;

public class ques_4 {
    public static Scanner input=new Scanner(System.in);
    
    public static void swap(String arr[],int i, int j){
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static String largestNumber(List<Integer> al) {
        
        String[] strArr=new String[al.size()];
        StringBuilder sb =new StringBuilder();
        
        for(int i = 0; i < al.size(); i++){
            strArr[i] = String.valueOf(al.get(i));
        }
        
        for(int i=0;i<strArr.length-1;i++){
            for(int j=i+1;j<strArr.length;j++){
                
                if((strArr[i]+strArr[j]).compareTo((strArr[j]+strArr[i]))<0){
                    
                    swap(strArr,i,j);
                }
            }
        }
        
        for(int i=0;i<strArr.length;i++){
            if(Integer.parseInt(strArr[i]) == 0 && sb.length() == 0){
                continue;
            }

            sb.append(strArr[i]);
        }        
            
            
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> al=new ArrayList<Integer>();
        while (input.hasNextInt()) {
            al.add(input.nextInt());
        }
        
        System.out.println(largestNumber(al));
    }
}