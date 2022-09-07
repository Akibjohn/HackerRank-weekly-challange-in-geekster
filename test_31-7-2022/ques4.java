// Take Integer N as input and print the following pattern.

// *** ***  
// **   **  
// *     *  
// **   **  
// *** ***
// Note: N will be an odd number.

// Input Format

// Single Line Input

// Integer Value
// Constraints

// 1<=N<=100
// Output Format

// N Line of Pattern as shown in problem statement.

// Sample Input 0

// 5
// Sample Output 0

// *** ***
// **   **
// *     *
// **   **
// *** ***


import java.util.*;

public class ques4 {
    public static Scanner input = new Scanner(System.in);
    
    public static void pattern(int n){
        int lines=(n+1)/2,nst=(n+1)/2,nsp=1;
        for(int r=1; r<=n; r++){
            for(int cst=1; cst<=nst; cst++){
                System.out.print("*");
            }
            for(int csp=1; csp<=nsp; csp++){
                System.out.print(" ");
            }
            
             for(int cst=1; cst<=nst; cst++){
                System.out.print("*");
            }
           if(r<lines){
               nsp= nsp+2;
               nst--;
           }else {
               nsp=nsp-2;
               nst++;
           }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = input.nextInt();
        pattern(n);
    }
}