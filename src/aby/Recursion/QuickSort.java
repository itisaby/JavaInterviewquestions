package aby.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSort(arr, 0, arr.length-1);
//        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSort(int[] nums, int l, int h){
        if(l>=h){
            return;
        }
        int s = l;
        int e = h;
        int mid = s + (e-s)/2;
        int pivot = nums[mid];
        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] =nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        //pivot at correct index
        QuickSort(nums, l, e);
        QuickSort(nums, s, h);
    }
}
