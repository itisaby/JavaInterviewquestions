public class MultiRec {
    public static void main(String[] args) {

    }
    public static int Fibo(int n){
        if(n<=1){
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
}
