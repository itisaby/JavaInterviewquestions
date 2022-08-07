package aby.Recursion.Subsequence;

import java.util.ArrayList;

public class ArrayListofString {
    public static void main(String[] args) {
        System.out.println(subseq("abc", ""));
        System.out.println(subseqAscii("abc", ""));
    }
    public static ArrayList<String> subseq(String S, String M){
        if(S.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(M);
            return list;
        }
        char ch = S.charAt(0);
        ArrayList<String> left = subseq(S.substring(1),  M+ch);
        ArrayList<String> right = subseq(S.substring(1), M);
        left.addAll(right);
        return left;
    }
    public static ArrayList<String> subseqAscii(String S, String M){
        if(S.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(M);
            return list;
        }
        char ch = S.charAt(0);
        ArrayList<String> left = subseqAscii(S.substring(1),  M+ch);
        ArrayList<String> right = subseqAscii(S.substring(1), M);
        ArrayList<String> asciii = subseqAscii(S.substring(1), M + (ch+0));
        right.addAll(asciii);
        left.addAll(right);
        return left;
    }
}
