public class MultiRec {
    public static void main(String[] args) {
//        System.out.println(Fibo(6));
        int[] arr = new int[]{1, 2, 44, 121, 44, 65, 3};
        int target = 2;
        System.out.println(BinarySearchwithR(arr, arr[0], arr[arr.length-1], target));
    }
    public static int Fibo(int n){
        if(n<=1){
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
    public static int BinarySearchwithR(int[] arr, int start, int end, int target){
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]<target){
            return BinarySearchwithR(arr, mid+1, end, target);
        }
        if(arr[mid]>target){
            return BinarySearchwithR(arr, start, mid-1, target);
        }
        return -1;
    }
}
