package aby.Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = MergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] MergeSort(int[] a){
        if(a.length==1){
            return a;
        }
        int mid = a.length/2;
        int[] left = MergeSort(Arrays.copyOfRange(a, 0, mid) );
        int[] right= MergeSort(Arrays.copyOfRange(a, mid, a.length));

        return Merge(left, right);
    }
    static int[] Merge(int[] a, int[] b){
        int[] mix = new int[a.length +b.length];
        int i=0, j=0, k=0;
        while(i<a.length && j< b.length){
            if(a[i]<b[j]){
                mix[k] = a[i];
                i++;
            }else{
                mix[k] = b[j];
                j++;
            }
            k++;
        }

        //remaining elements
        while(i<a.length){
            mix[k] = a[i];
            i++; k++;
        }
        while(j<b.length){
            mix[k] = b[j];
            j++; k++;
        }
        return mix;
    }
}
