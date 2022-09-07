// Given two strings s and p, return an array of all the start indices of p's anagrams in s.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// Input Format

// You need to take two strings as input s and p.

// Constraints

// 1 <= s.length(),p.length() <= 10^3

// Output Format

// Print all the starting index of anagram in given string s by giving a space between them.
// Sample Input 0

// cbaebabacd
// abc

// Sample Output 0

// 0 6
// Explanation 0

// Input: s = "cbaebabacd", p = "abc" Output:0 6 Explanation: The substring with start index = 0 is "cba", which is an anagram of "abc". The substring with start index = 6 is "bac", which is an anagram of "abc".





import java.io.*;
import java.util.*;

public class ques_1{
    public static Scanner input=new Scanner(System.in);
    
    public static void print(List<Integer> al){
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
    
    public static List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        List<Integer> ans=new ArrayList<>();
        if(m>n)
        {
            return ans;
        }
        int[] s_fm=new int[26];
        int[] p_fm=new int[26];
        for(int i=0;i<m;++i)
        {
            p_fm[p.charAt(i)-'a']++;
            s_fm[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(p_fm,s_fm))
        {
            ans.add(0);
        }
        for(int i=m;i<n;++i)
        {
            s_fm[s.charAt(i-m)-'a']--;
            s_fm[s.charAt(i)-'a']++;
            if(Arrays.equals(p_fm,s_fm))
            {
                ans.add(i-m+1);
            }
        }
        return ans;
    }
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s=input.nextLine();
        String p=input.nextLine();
        print(findAnagrams(s,p));
        
    }
}