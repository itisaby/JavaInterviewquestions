public class FirstandLast {
    public static void main(String[] args) {

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = Search(nums, target, true);
        int end = Search(nums, target, false);
        ans[0] = start;
        ans[1] = end;

       return ans;
       
    }
    public static int Search(int[] nums, int target, boolean firstside){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if(nums[mid] < target) {
                start = mid + 1;
            }
            else{
                ans = mid;
                if(firstside){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
