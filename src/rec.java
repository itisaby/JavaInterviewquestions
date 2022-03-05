public class rec {
    public static void main(String[] args) {
//        name(1, 5);
//        num(1,5);
//          reversenum(4, 4);
//        numbacktracking(4, 4);
        revnumbacktracking(4, 4);
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
}
