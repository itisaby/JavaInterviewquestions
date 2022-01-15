public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 2, 9, 2, 2, 3};
        System.out.println(findPivotWithDuplicate(arr));
        System.out.println(search(arr, 2));
    }
//this will not cover duplicate values
    
    static public int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
//            case1
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return  mid-1;
            }
            if(arr[mid]<=arr[start]){
                end= mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    static public int findPivotWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
//            case1
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return  mid-1;
            }
            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int Binarysearch(int[] arr, int target, int start, int end) {
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
    static public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1){
            return Binarysearch(nums, target, 0, nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target>=nums[0]){
            return Binarysearch(nums, target, 0, pivot-1);
        }

        return Binarysearch(nums, target, pivot+1, nums.length-1);

    }


}
