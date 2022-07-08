import java.util.Arrays;

public class StringsBasics {
    public static void main(String[] args) {
        String name = "Arnab Maity";  //string is immutable
        String name1 = "Arnab Maity";
        System.out.println(name);
//        Creating two new object
        String s = new String("Arnab");
        String s2 = new String("Arnab");
        System.out.println(s==s2);
        System.out.println(s.equals(s2));
        System.out.println(name==name1);
        String a = name;
        System.out.println(a);
        System.out.println(a.charAt(1));
        //Comparison Of strings
        // == method -> Comparator -> check for values and the reference variables pointing to same object
        // .equals() -> Checks for the value
        Integer num = new Integer(12);
        System.out.println(num.toString());
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5}));
        float aby = 453.23122f;
        System.out.printf("Formatted number is %.2f", aby);
        System.out.println();
        System.out.printf("Pie: %.3f", Math.PI);
        //Operators
        System.out.println('a' + 'b'); //operators converting into ASCII and then adding up
        System.out.println("A" + "B"); // + operator overloading
        System.out.println((char)('a'+3));
        System.out.println("a" + 3); //this will be converted to Integer that will call toString()

    }
}
