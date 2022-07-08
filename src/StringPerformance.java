public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
//            System.out.println(ch);
            series = series+ch; //it will bring time complexity of O(n^2)
        }
        System.out.println(series);
    }
}
