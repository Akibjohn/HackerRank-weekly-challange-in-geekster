import java.util.*;

public class ques2 {
    public static Scanner input = new Scanner(System.in);

    public static int reverseNum(int n) {
        int reverse = 0;
        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        return reverse;
        
    }

    public static boolean prime(int n){
        if(n <= 1)
			return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int rev=reverseNum(n);
        System.out.println(reverseNum(n));
        if(prime(n)==prime(rev)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
