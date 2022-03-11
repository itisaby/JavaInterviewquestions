public class RecConcept {

        static int sum = 0;
        static void rev1(int n){
            if(n==0){
                return;
            }
            int rem = n%10;
            sum = sum*10 +rem;
            rev1(n/10);
        }
       public static int count(int n){
            return helper(n, 0);
       }
       //pattern to pass a value to above calls
       public static int helper(int n, int c){
            if(n==0){
                return c;
            }
            if(n%10 == 0){
                return helper(n/10, c+1);
            }
            return helper(n/10, c);
       }

    //pasing numbers
    public static void main(String[] args) {
//        fun(5);
//          rev1(1234);
//        System.out.println(sum);
        System.out.println(count(10401));
    }
    // Passing numbers
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
//        fun(n--);    // Will raise an error
//        n-- vs --n is not same
        fun(--n);
    }
    // Reverse A Number
    public static void Reverse(int n){

    }
}
