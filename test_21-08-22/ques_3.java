import java.util.*;
public class ques_3 {
    public static Scanner input=new Scanner(System.in);
    
    public static long xorPrime(long n) {
        long i = 2;
        long xorVal=0;
        while (n > 1) {
            while (n % i == 0) {
                xorVal = xorVal ^ i;
                n /= i;
            }
            i++;
        }
        return xorVal;
    }
    public static void main(String[] args) {
        long n=input.nextLong();
        System.out.println(xorPrime(n));
        
    }
}
