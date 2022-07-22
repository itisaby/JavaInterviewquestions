package aby.Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr, 8, 0, arr.length-1));
    }
    static int search(int[] a, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(a[mid]==target){
            return mid;
        }
        if(a[s]<=a[mid]){
            if(target>=a[s] && target<=a[mid]){
//                e = mid-1;
                return search(a, target, s, mid-1);
            }else{
//                s = mid+1;
                return search(a, target, mid+1, e);
            }
        }else if(target>=a[mid] && target<=a[e]){
//            s = mid+1;
            return search(a, target, mid+1, e);
        }else{
//            e = mid-1;
            return search(a, target, s, mid-1);
        }
    }
}
