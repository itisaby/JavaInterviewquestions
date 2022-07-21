package aby.Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
       reverse(2431);
        System.out.println(sum);
        System.out.println(rev2(2345));
    }
    static int sum=0;
    static  void reverse(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 +rem;
        reverse(n/10);
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

}
