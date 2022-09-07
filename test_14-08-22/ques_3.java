import java.util.*;

public class ques_3 {
    public static Scanner input = new Scanner(System.in);

    public static String integerToRoman(int n) {

        int[] integerArr = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanArr = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < integerArr.length; i++) {
            while (n >= integerArr[i]) {
                n -= integerArr[i];
                sb.append(romanArr[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        int n = input.nextInt();
        System.out.println(integerToRoman(n));
    }

}
