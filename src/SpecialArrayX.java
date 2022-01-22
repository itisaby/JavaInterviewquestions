import java.util.Arrays;

public class SpecialArrayX {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i < 101 ; i++){
            if(i == nums.length-leftMostIndex(nums,i)) return i ;
        }
        return -1;
    }
    // function to get left most value
    public int leftMostIndex(int[] nums ,int target){
        int left = 0 , right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>=target){
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }
        }
        return left ;  //we can return either left or mid as both pointers point same index
    }
}
