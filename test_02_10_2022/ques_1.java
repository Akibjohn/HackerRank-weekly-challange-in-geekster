/*
 * Total Number of Words
 * 
 * You have n tiles, where each tile has one letter tiles[i] printed on it.

Return the number of possible non-empty sequences of letters you can make using the letters printed on those tiles.

Input Format

There is only one line in the input. This denotes the charcater on each tile.

Constraints

1 <= tiles.length <= 7 tiles consists of uppercase English letters.

Output Format

Output a number, the answer.

Sample Input 0

AAB
Sample Output 0

8
Explanation 0

The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".

Sample Input 1

V
Sample Output 1

1
 */


import java.util.*;

public class ques_1 {
    public static  Scanner scn = new Scanner(System.in);

    public static int numTilePossibilities(String tiles) {

        int[] count = new int[26];

        for (char c : tiles.toCharArray())
            count[c - 'A']++;

        return dfs(count);

    }

    public static int dfs(int[] arr) {

        int sum = 0;

        for (int i = 0; i < 26; i++) {

            if (arr[i] == 0)
                continue;

            sum++;

            arr[i]--;

            sum += dfs(arr);

            arr[i]++;

        }

        return sum;

    }

    public static void main(String[] args) {
       
        String str = scn.nextLine();
        System.out.print(numTilePossibilities(str));

        
    }

    
}