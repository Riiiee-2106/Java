package lecture21;

 public class demo66{
    public static void main(String[] args) {
        //Immutable classes

        // Student s1 = new Student(28,"Richa");
        // System.out.println(s1.getName());
        // System.out.println(s1.getAge());

        //so is the class turned to immutable class? - No
        College clg = new College("iitg","guwahati");
        Student s1 = new Student(28,"Richa",clg);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getCollege().name);
        clg.name = "iitb";
        System.out.println(s1.getCollege().name); //class got mutable with College mutable class , as we get College reference from class College - class didnot got immutable

         


    }
}


//1.keep class final
//2.instance variables can be private final
//3.no setters


final class Student{
    private int age;
    private String name;
    private /*String*/College college;

    Student(int age,String name,/*String*/College college){
        this.name = name;
        this.age = age;
        this.college = college;
    }

    //getters
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public /*String*/College getCollege(){
        return college;
    }
}

class College{
    String name;
    String address;

    College(String name,String address){
        this.name = name;
        this.address = address;
    }
} 