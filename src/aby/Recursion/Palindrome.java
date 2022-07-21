package aby.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1421));
    }
    static int rev2(int n){
        int dig =  (int)(Math.log10(n)) + 1; //Counting no of digits
        return helper(n, dig);
    }
    static int helper(int n, int dig){
        if(n%10 == n){
            return n;
        }
        return n%10 * (int)(Math.pow(10, dig-1)) + helper(n/10, dig-1);
    }
    static Boolean palindrome(int n){
        int ans = rev2(n);
        if(ans==n){
            return true;
        }else{
            return false;
        }
    }
}
