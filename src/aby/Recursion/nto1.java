package aby.Recursion;

public class nto1 {
    public static void main(String[] args) {
        ntoone(5);
    }
    static void ntoone(int n){
        if(n==0){
//            System.out.println("1");
            return;
        }
        System.out.println(n); //54321
        ntoone(n-1);
    }
    static void oneton(int n){
        if (n==0){
            return;
        }
        oneton(n-1);
        System.out.println(n);
    }
    static void full(int n){
        if(n==0){
//            System.out.println("1");
            return;
        }
        System.out.println(n); //54321
        ntoone(n-1);
        System.out.println(n); //12345
    }
}
