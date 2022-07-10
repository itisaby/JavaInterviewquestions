
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassesBasics{
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];



        Student Arnab = new Student(15, "Arnab", 85.4f);
        Student rahul = new Student(18, "Rahul ", 90.3f);

//
//
        System.out.println(Arnab.rno);
        System.out.println(Arnab.name);
        System.out.println(Arnab.marks);

        Student random = new Student(Arnab);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);

    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;
    Boolean happy;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }


    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
        this.happy = true;
    }

}