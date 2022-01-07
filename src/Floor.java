public class Floor {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 9, 14, 16, 18};
        int target = 10;
        System.out.println(Binarysearch(arr, target));
    }
    static int Binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                if (arr[mid] >= target) {
                    return mid;
                }

                start = mid + 1;
            }
        }

        return end;
    }
}
