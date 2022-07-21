package aby.Recursion;

public class ProductofDigits {
    public static void main(String[] args) {
        System.out.println(prodDigits(5402));
    }
    static int prodDigits(int n){
        if(n/10==0){
            return n;
        }
        return n%10 * prodDigits(n/10);
    }
}
