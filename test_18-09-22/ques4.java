// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is balanced or not.

// Input Format

// First and only line of input contains single string.

// Constraints

// 1<=str.length()<=10^4

// Output Format

// Print true if string is balanced or print false if string is not balanced.

// Sample Input 0

// ()[]{}
// Sample Output 0

// true
// Sample Input 1

// (]((
// Sample Output 1

// false






import java.util.*;

public class ques4 {
    public static Scanner input=new Scanner(System.in);
    
    public static boolean isValid(String str) {
        char[] ch=str.toCharArray();
        Stack<Character> stack = new Stack<> ();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[' ){
                stack.push(ch[i]);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top=stack.peek();
                    if(ch[i]==')' && top!='('){
                        return false;
                    }
                    else if(ch[i]=='}' && stack.peek()!='{'){
                        return false;
                    }
                    else if(ch[i]==']' && stack.peek()!='['){
                        return false;
                    }else{
                        stack.pop();
                    }
                }
                
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String str =input.nextLine();
        System.out.println(isValid(str));
    }
}