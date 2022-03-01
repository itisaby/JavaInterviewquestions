public class Pattern {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(4);
//        pattern3(4);
//          pattern4(4);
          pattern5(4);


    }
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            //when this row is printed we need to add a new line
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            //when this row is printed we need to add a new line
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col);
            }
            System.out.println("");
        }
    }
    static void pattern5(int n){
        for (int row = 1; row <= 2*n-1; row++) {
            if(row>n){
                for (int col = 1; col <=2*n-row; col++) {
                    System.out.print("*");
                }
            }
            else{
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
