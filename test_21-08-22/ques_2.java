import java.util.*;

public class ques_2 {
    public static Scanner input=new Scanner(System.in);
    
    public static void reverseStr(String str){
        String[] arr=str.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<arr[i].length();j++){
                char ch=arr[i].charAt(j);
                if(ch!=' '){
                    sb.append(ch);
                }
            }
            sb.append(' ');
        }
        System.out.println(sb);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String str=input.nextLine();
        reverseStr(str);
    }
}