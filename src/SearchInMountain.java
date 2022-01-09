public class SearchInMountain {
    public static void main(String[] args) {

    }
    public static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstry = orderAgnosticBS(arr, target, 0, peak);
        if(firstry!=-1){
            return firstry;
        }
        int secondtry = orderAgnosticBS(arr, target, peak+1, arr.length-1);
        if(secondtry!=-1){
            return secondtry
        }
        return -1;

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length -1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid; //there's a chance that this might be the answer
            }
            else{
                start = mid+1;
            }
        }
        return end; // or return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {


        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
