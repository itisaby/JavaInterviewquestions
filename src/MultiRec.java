public class MultiRec {
    public static void main(String[] args) {
        System.out.println(Fibo(6));
    }
    public static int Fibo(int n){
        if(n<=1){
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
}
