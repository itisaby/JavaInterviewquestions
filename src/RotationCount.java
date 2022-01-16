public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {12, 15, 18, 2, 3, 6, 12};
        System.out.println(NumRotations(arr));

    }
//this will not cover duplicate values
    static public int NumRotations(int[] arr){
        int pivotindex= findPivot(arr);
        if(pivotindex==-1){
            return 0;
        }
        return pivotindex+1;
    }
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

}
