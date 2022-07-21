package aby.Recursion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZero(121));
    }
    static int countZero(int n){
        int ct=0;
        return helper(n, ct);
    }
    static  int helper(int n, int ct){
        if(n/10==0){
            return ct;
        }
        if(n%10==0){
            ct++;
        }
        return helper(n/10, ct);
    }
}
