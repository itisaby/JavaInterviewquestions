package aby.Recursion.Subsequence;

public class Subsequences {
    public static void main(String[] args) {
        subseq("abc","");
    }
    static void subseq(String S, String M){
        if(S.isEmpty()){
            System.out.println(M);
            return;
        }
        char ch = S.charAt(0);
        subseq(S.substring(1),  M+ch);
        subseq(S.substring(1), M);
    }
}
