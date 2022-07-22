package aby.Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={4,3,2,1};
        System.out.println(Arrays.toString(arr));
        selsort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selsort(int[] a, int r, int c, int max){
        if(r==0){
            return;
        }
        if(r>c){
            if(a[c]>a[max]){
                selsort(a, r, c+1, c);
            }else{
                selsort(a, r,c+1, max);
            }
        }else{
            int temp = a[max];
            a[max] = a[r-1];
            a[r-1] = temp;
            selsort(a, r-1, 0, 0);
        }
    }

}
