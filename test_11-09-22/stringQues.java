// Given a string str and a pattern pat. You need to check whether pattern is present or not in the given string.

// Input Format

// given two strings str and patter

// Constraints

// 1 <= T <= 100
// 1 <= |str| <= 30
// 1 <= |text| <= 30
// Output Format

// bool true if present else false

// Sample Input 0

// abcdefh
// bcd
// Sample Output 0

// true
// Explanation 0

// bcd string is a substring in abcdefh

// Sample Input 1

// axzy
// xy
// Sample Output 1

// false
// Explanation 1

// here xy is not a substring in axzy





import java.util.*;

public class stringQues {
    public static Scanner input=new Scanner(System.in);
    
    public static boolean isPresent(String str, String pattern , int idx){
        int i=idx;
        int j=0;
        while(j<pattern.length()){
            if(str.charAt(i++)!=pattern.charAt(j++)){
                return false;
            }
            
        }
        return true;
    }
    public static boolean slidingWindow(String str, String pattern){
        
        for(int i=0;i<str.length();i++){
            if(isPresent(str,pattern,i)==true){
                return true;
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String str=input.nextLine();
        String pattern=input.nextLine();
        System.out.println(slidingWindow(str,pattern));
        
    }
}