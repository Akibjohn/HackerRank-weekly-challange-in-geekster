// // Longest Palindrome

// Given a string s which consists of lowercase or uppercase letters, print the length of the longest palindrome that can be built with those letters.

// Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

// Input Format

// Take a string s as input.
// Constraints

// 1 <= s.length <= 2000
// s consists of lowercase and/or uppercase English letters only.
// Output Format

// Output should be of integer form
// Sample Input 0

// abccccdd
// Sample Output 0

// 7
// Explanation 0

// One longest palindrome that can be built is "dccaccd", whose length is 7.


 

import java.util.*;

public class ques3 {
    public static Scanner input=new Scanner(System.in);
    
    public static int longestPalindrom(String str){
        HashMap<Character, Integer> hm=new HashMap<>();
        for(char ch: str.toCharArray()) hm.put(ch, hm.getOrDefault(ch,0)+1);
        int even=0;
        int odd=0;
        for(char ch : hm.keySet()){
            int val=hm.get(ch);
            if(val%2==0){
                even+=val;
            }else if(val%2!=0){
                odd=Math.max(val,odd);
            }
        }
        int ans=even+odd;
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String str=input.nextLine();
        System.out.println(longestPalindrom(str));
    }
}