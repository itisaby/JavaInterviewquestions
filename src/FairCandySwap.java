import java.util.Arrays;

public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alicesum = arraysum(aliceSizes);
        int bobsum = arraysum(bobSizes);
        int diff = (alicesum-bobsum)/2;
        Arrays.sort(aliceSizes); //O(logN)
        for(int i: bobSizes){
            if(binarySearch(aliceSizes, diff+i)>=0){
                return new int[]{diff+i, i};
            }
        }
        return null;
    }
    public int arraysum(int[] num){
        int sum=0;
        for(int i=0; i<num.length; i++){
            sum+=num[i];
        }
        return sum;
    }
    public int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        while(start <=end){
            int mid = start + (end -start)/2;
            if (array[mid]<target) start = mid+1;
            else if (array[mid]>target) end = mid-1;
            else return mid;
        }
        return -1;
    }

}
