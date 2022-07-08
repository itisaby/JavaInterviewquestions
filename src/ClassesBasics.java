import java.util.Arrays;

public class ClassesBasics {
    public class Student {
        int rollno;
        String name;
        float marks;
    }

    public static void main(String[] args) {
        //All classes are dynamically allocated
        Student[] students = new Student[5]; //new operator dynamically allocates memory and returns a reference to it
        System.out.println(Arrays.toString(students));
        Student Arnab = new Student();
        Arnab.marks = 12;
        Arnab.name="Arnab";
        Arnab.rollno = 22;
        System.out.println(Arnab.name);
    }

}
