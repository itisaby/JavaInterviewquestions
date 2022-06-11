public class DuplicateNumber {

        public int findDuplicate(int[] nums) {
            int i=0;
            while(i<nums.length){
                int correct = nums[i];
                if(nums[i]<nums.length && nums[i]!=nums[correct]){
                    swap(nums, i, correct);
                }else{
                    i++;
                }
            }
            //searching for the first misiing number
            for(int index=0; index<nums.length; index++){
                if(nums[index]!=index){
                    return nums[index];
                }
            }
            return -1;
        }
        private void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first]=arr[second];
            arr[second] = temp;
        }

    public static void main(String[] args) {

    }
}
