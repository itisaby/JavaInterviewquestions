public class Pattern {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(4);
//        pattern3(4);
//          pattern4(4);
//          pattern5(4);
//          pattern6(4);
//        pattern7(4);
//        pattern8(4);
        pattern9(4);

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
    static void pattern6(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalCols = row>n? 2*n-row: row;
            int spaces = n - totalCols;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern7(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println("");
        }
    }
    static void pattern8(int n){
        for (int row = 1; row <= 2*n; row++) {
            int c = row>n? 2*n-row: row;
            for (int space = 0; space < n-c; space++) {
                System.out.print(" ");
            }
            for (int col = c; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col);
            }
            System.out.println("");
        }
    }
    static void pattern9(int n){
        int On = n;
        n = 2*n;
        for (int row = 0; row <= n; row++) {
            for (int cols = 0; cols <= n-1; cols++) {
                int atindex = On - Math.min(Math.min(row, cols), Math.min(n-row, n-cols));
                System.out.print(atindex + " ");
            }
            System.out.println();
        }
    }

}
