package aby.Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(digitSum(5432));
    }
    static int digitSum(int n){
        if(n/10==0){
            return n;
        }
        return n%10 + digitSum(n/10);
    }
}
