public class ValidPerfectSquare {
    public static void main(String[] args) {

    }
    public static boolean isPerfectSquare(int num) {
        int start=2;
        int mid,end=num;
        if (num<2){
            return true;
        }
        while(start<=end){
            mid=start+(end-start)/2;
            if (mid==((float)num/mid)){
                return true;
            }
            else if (mid<(num/mid)){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}
