public class Pattern {
    public static void main(String[] args) {
        pattern1(4);
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
}
