public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 44, 121, 44, 65, 3};
        int target = 65;
        int ans = LinearSearchfunc(arr, target);
        System.out.println(ans);
    }

    static int LinearSearchfunc(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        } else {
            for(int i = 0; i < arr.length; ++i) {
                if (arr[i] == target) {
                    return i;
                }
            }

            return -1;
        }
    }
}
