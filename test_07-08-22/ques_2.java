import java.util.*;

public class ques_2 {
    public static Scanner input = new Scanner(System.in);

    public static void input1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static void tPrime(int[] arr) {
        int n = arr.length, count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            count = 0;
        }
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] arr = new int[n];
        input1D(arr);
        tPrime(arr);
        
    }

}
