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


    }
}
