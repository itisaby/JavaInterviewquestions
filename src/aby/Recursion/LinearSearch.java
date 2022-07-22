package aby.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 34, 34, 35};
        System.out.println(linearS(arr, 0, 35));
        FindAllIndex(arr, 0, 34);
        System.out.println(list);
    }
    static int linearS(int[] a, int index, int x){
        if(index==a.length){
            return -1;
        }
        if(a[index]==x){
            return index;
        }else{
            return linearS(a, index+1, x);
        }

    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndex(int[] a, int index, int x){
        if(index==a.length){
            return;
        }
        if(a[index]==x){
            list.add(index);
        }
        FindAllIndex(a, index+1, x);
    }
}
