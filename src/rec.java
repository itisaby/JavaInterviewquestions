public class rec {
    public static void main(String[] args) {
//        name(1, 5);
//        num(1,5);
//          reversenum(4, 4);
//        numbacktracking(4, 4);
//        revnumbacktracking(4, 4);
        System.out.println(DigitSum(1234));
    }


    public static void func(int c){
        if(c==5){
            return;
        }
        System.out.println(c);
        c++;
        func(c);

    }
    public static void name(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("Arnab");
        i++;
        name(i, n);
    }
    public static void num(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        i++;
        num(i, n);
    }
    public static void reversenum(int i, int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        i--;
        reversenum(i, n);
    }
    public static void numbacktracking(int i, int n){
        if(i<1){
            return;
        }
        numbacktracking(i-1, n);
        System.out.println(i);
    }
    public static void revnumbacktracking(int i, int n){
        if(i<1){
            return;
        }
        revnumbacktracking(i-1, n);
        System.out.println(n-i+1);
    }
    public static void reverseArray(int i, int[] arr, int n){
        if(i>=n/2){
            return;
        }
        swap(arr[i], arr[n-i-1]);
        reverseArray(i+1, arr, n);
    }
    public static void swap(int i, int j){
        int temp = i;
        i = j;
        j = temp;
    }
    public static boolean isPalindrome(String s, int i, int n){
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt((n-i-1))){
            return  false;
        }
        return isPalindrome(s, i+1, n);
    }
    public static int DigitSum(int n){
        if(n<=1){
            return 1;
        }
        return n%10 + DigitSum(n/10);
    }
}
