package aby.Recursion;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(SkipString("applebdh"));
    }
    public static String SkipString(String S){
        if(S.isEmpty()){
            return "";
        }
        if(S.startsWith("app")){
            return SkipString(S.substring(3));
        }else{
            return S.charAt(0) + SkipString(S.substring(1));
        }
    }
    public static String SkipStringnotApple(String S){
        if(S.isEmpty()){
            return "";
        }
        if(S.startsWith("app") && !S.startsWith("apple")){
            return SkipStringnotApple(S.substring(3));
        }else{
            return S.charAt(0) + SkipStringnotApple(S.substring(1));
        }
    }

}
