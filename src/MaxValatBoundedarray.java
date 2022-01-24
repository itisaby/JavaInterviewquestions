public class MaxValatBoundedarray {
    int n;
    int index;
    public int maxValue(int n, int index, int maxSum) {

        this.n = n;
        this.index = index;

        int low = 1;
        int high = maxSum;
        int res = 1;

        while (low <= high) {
            int mid = (high - low)/2 + low;
            long cur = getSum(mid);

            if (cur <= maxSum) {
                low = mid + 1;
                res = mid;
            }
            else high = mid - 1;
        }
        return res;
    }

    private long getSum(int height) {
        height--;

        long sum = -height;
        long left = Math.min(index + 1, height);
        long right = Math.min(height, n - index);
        sum += (left*(2*height - left + 1)/2) + right*(2*height - right + 1)/2;
        sum += n;
        return sum;
    }
}
