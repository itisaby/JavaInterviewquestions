public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {12, 15, 18, 2, 3, 6, 12};
        System.out.println(NumRotations(arr));

    }
//this will not cover duplicate values
    static public int NumRotations(int[] arr){
        int pivotindex= findPivot(arr);
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

}
