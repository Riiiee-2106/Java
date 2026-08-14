package lec16.more_about_packages;


import lec16.more_about_packages.college.Student;
// import lec16.more_about_packages.school.Student; we cannot import same file from different folders like this


// we can also import  -- like
 import lec16.more_about_packages.college.*; 



public class demo34 {

    public static void main(String[] args) {
        
    


    Student s1 = new Student();
    // s1.print(); //cant access print method until it is void as, it is present in different package

      //we can call same file of different folder like this as well
    lec16.more_about_packages.school.Student s2 = new lec16.more_about_packages.school.Student();
    // this above statement is true only when demo34 and package school all are in same module
    
    s2.print();

    
    }
    
}
