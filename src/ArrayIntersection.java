import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums1){
            for(int j : nums2){
                if(i==j){
                    if(!list.contains(i)){
                        list.add(i);
                    }
                }
            }
        }
        int[] result = new int[list.size()];
        int index =0;
        for(int no : list){
            result[index] = no;
            index++;
        }
        return result;
    }
}
