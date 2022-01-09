public class PeakIndex {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
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
}
