package lecture16.packages;
import lecture16.packages.College.Student;  // Import Student class from College package

// import School.Student;
// We cannot import Student from both College and School packages
// because both classes have the same name (Student).

//import lecture16.packages.School.*;  // Import all classes from School package

public class demo39 {

    public static void main(String[] args) {

        // Student refers to College.Student because it is imported explicitly.
        Student s1 = new Student();

        //or simply you can access print function as - this can be only done if you're in same module
        lecture16.packages.School.Student s2 = new lecture16.packages.School.Student();

        // Calls the print() method of College.Student
        s1.print();
        s2.print();
    }
}