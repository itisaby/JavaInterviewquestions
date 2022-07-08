public class StringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
//            System.out.println(ch);
            builder.append(ch); // Now it's not creating new object
        }
        System.out.println(builder.toString());
    }
}
