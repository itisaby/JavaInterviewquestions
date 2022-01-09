public class positioninInfinite {
    public static void main(String[] args) {
        int[] arr ={3, 5, 7, 9, 10 ,11, 13, 15, 17, 21, 22, 110, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int newS = end+1;
            end = end + (end-start+1)*2;
            start = newS;
        }
        return  Binarysearch(arr, target, end, start);
    }
    static int Binarysearch(int[] arr, int target, int end, int start) {


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

        return -1;
    }
}
