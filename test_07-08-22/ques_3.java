import java.util.*;
public class ques_3 {
    public static Scanner input=new Scanner(System.in);

    public static boolean goodStr(String str){
        int[] farr = new int[129];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            farr[ch]++;
        }

        for (int i = 0; i < farr.length; i++) {
            if (farr[i]>0) {
                list.add(farr[i]);
            }
        }
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)!=list.get(i+1)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str=input.nextLine();
        System.out.println(goodStr(str));
    }
}