public class MaxWealth {
    public MaxWealth() {
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maxwealth(arr));
    }

    static int maxwealth(int[][] arr) {
        int ans = -2147483648;

        for(int i = 0; i < arr.length; ++i) {
            int rowsum = 0;

            for(int j = 0; j < arr[i].length; ++j) {
                rowsum += arr[i][j];
            }

            if (ans < rowsum) {
                ans = rowsum;
            }
        }

        return ans;
    }
}
