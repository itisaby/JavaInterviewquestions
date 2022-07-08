import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Arnab Maity";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.indexOf("a"));
        System.out.println("   Arnab   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
