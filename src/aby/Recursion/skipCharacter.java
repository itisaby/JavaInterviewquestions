package aby.Recursion;

public class skipCharacter {
    public static void main(String[] args) {
        charSkip("aadvdhs", "");
        System.out.println(CHarSkip("ffadgsdasfga"));
    }
    public static void charSkip(String S, String N){
        if(S.isEmpty()){
            System.out.println(N);
            return;
        }
        char ch = S.charAt(0);
        if(ch=='a'){
            charSkip(S.substring(1), N);
        }else{
            charSkip(S.substring(1), N+ch);
        }
    }
    public static String CHarSkip(String S){
        if(S.isEmpty()){
            return "";
        }
        char ch = S.charAt(0);
        if(ch=='a'){
            return CHarSkip(S.substring(1));
        }else{
            return ch+CHarSkip(S.substring(1));
        }
    }
}
