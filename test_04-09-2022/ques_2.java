// Given two points, find the Euclidean distance between them.

// Formula:

// Euclidean distance: d =√[(x2 – x1)^2 + (y2 – y1)^2]

// Input Format

// The first line contains the co-ordinates of point-1: x1 y1

// The second line contains the co-ordinates of point-2: x2 y2

// Constraints

// -1000 <= x1, y1, x2, y2 <= 1000

// Output Format

// Print the Euclidean distance between point P1 and point P2.

// Round the answer to the nearest ceil value.

// Sample Input 0

// 0 0 
// 2 -2
// Sample Output 0

// 3
// Explanation 0

// Here Point-1 : (x1, y1) = (0,0) and Point-2 : (x2, y2) = (2,-2)

// Applying the formula for Euclidean distance we get distance between P1 and P2 = 2.8284271247461903. The round off value = 3

// Sample Input 1

// -20 23
// -15 68
// Sample Output 1

// 45
// Explanation 1

// Here, (x1, y1) = (-20, 23) (x2, y2) = (-15, 68) On applying the Euclidean Formula, we get distance = 45.2769 On rounding off this value, we get distance = 45



import java.io.*;
import java.util.*;

public class ques_2 {
    public static Scanner input=new Scanner(System.in);
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int x1=input.nextInt();
        int y1=input.nextInt();
        int x2=input.nextInt();
        int y2=input.nextInt();
        double distance=Math.sqrt(((x2-x1) * (x2-x1))+((y2-y1) * (y2-y1)));
        System.out.println((int)Math.round(distance*1.0));
    }
}

