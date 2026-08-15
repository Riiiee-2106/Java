package lec21;

public class demo55 {

    public static void main(String[] args) {
        

        College college = new College("iitg", "guwahati");
        // Student s1 = new Student(28,"ram","IITG");


        Student s1 = new Student(21, "richa", college);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getCollege().name);

        college.name = "iitk";
        System.out.println(s1.getCollege().name);

        // we cant access the variables of class Student    -- as they are private

        
    }
    
}


// Immutable class --- now it is not immutable(not purely immutable)

class Student{
    private final int age;

    private final String name;

    // private final String college;
    private final College college;

    Student (int age,String name,College college){
        this.age = age;
        this.name = name;
        this.college = college;
    }

    // getters  -- getAge()
    public int getAge(){
        return age;
    }


    // getter -- getName()
    public String getName(){

        return name;
    }

    public College getCollege(){
        return this.college;
    }

}


// class cseStd extends Student{

// }

// we cant even extend class Student as it is final



// but what if college class exists with its own variable and method
class College{

    String name;
    String address;

    College(String name,String address){
        this.name = name;
        this.address = address;
    }




}