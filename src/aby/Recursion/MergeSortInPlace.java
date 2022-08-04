package aby.Recursion;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 5};
        MergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void MergeSort(int[] a, int s, int e){
        if(e-s ==1){
            return;
        }
        int mid = (s+e)/2;
        MergeSort(a, s, mid);
        MergeSort(a, mid, e);
        mergeInPlace(a, s, mid, e);

    }
    static void mergeInPlace(int[] a, int s, int mid, int e){
        int[] mix = new int[e-s];
        int i=s, j=mid, k=0;
        while(i<mid && j< e){
            if(a[i]<a[j]){
                mix[k] = a[i];
                i++;
            }else{
                mix[k] = a[j];
                j++;
            }
            k++;
        }
        //remaining elements
        while(i<mid){
            mix[k] = a[i];
            i++; k++;
        }
        while(j<e){
            mix[k] = a[j];
            j++; k++;
        }
        for (int l = 0; l < mix.length; l++) {
            a[s+l] = mix[l];
        }
    }
}
