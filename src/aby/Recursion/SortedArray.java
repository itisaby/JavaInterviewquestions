package aby.Recursion;

import java.sql.Array;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 34, 35};
        System.out.println(Sorted(arr));
    }
    static Boolean Sorted(int[] a){
        return helper( a, 0);
    }

    static Boolean helper(int[] a, int index){
        if(index==a.length-1){
            return true;
        }
        return a[index]<a[index+1] && helper(a, index+1);
    }
}
