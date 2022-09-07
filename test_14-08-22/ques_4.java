import java.util.*;

public class ques_4 {
    public static Scanner input = new Scanner(System.in);

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static String reverseVowel(String str) {
        char[] ch = str.toCharArray();
        String getVowel = "";
        for (int i = 0; i < ch.length; i++) {
            if (isVowel(ch[i])) {
                getVowel += ch[i];
            }
        }

        int j = getVowel.length() - 1;
        for (int i = 0; i < ch.length; i++) {
            if (isVowel(ch[i])) {
                ch[i] = getVowel.charAt(j--);

            }
        }

        return String.valueOf(ch);

    }

    public static void main(String[] args) {
        String str = input.nextLine();
        System.out.println(reverseVowel(str));
    }

}
