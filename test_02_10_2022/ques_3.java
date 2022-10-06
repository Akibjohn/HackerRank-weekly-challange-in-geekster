/*
 * Odd Even Pattern
 * 
 * Given an integer n, you have print all even numbers till n followed by all odd numbers till n but in reverse order.

Input Format

First and only line of input contains an integer n.

Constraints

1<=n<=100

Output Format

Print all even numbers till n followed by all odd numbers till n but in reverse order

Sample Input 0

10
Sample Output 0

10 8 6 4 2 0 9 7 5 3 1 
Sample Input 1

5
Sample Output 1

4 2 0 5 3 1 
 */




import java.util.*;

public class ques_3 {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        
        int n=scn.nextInt();
        for(int i=n;i>=0;i--){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        for(int i=n;i>=0;i--){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        
    }
}