package aby.Recursion;

import java.util.ArrayList;

public class ReturnList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 34, 34, 35};
        System.out.println(ListArray(arr, 0, 34, list));
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> ListArray(int[] a, int index, int target, ArrayList<Integer> list){
        if(index == a.length){
            return list;
        }
        if(target == a[index]){
            list.add(index);
        }
        return ListArray(a, index+1, target, list);
    }
}
