package lecture16.packages.College;

public class Student {


    //this function if not made public will be default and can only be accessed within the class functions or same package not any where else

        //if made public it can be accessed within anywhere
    /*added public*/public void print(){
        System.out.println("student from college");
    }

    
}


class Teacher{
    void print(){
        Student s1 = new Student();
        //within class in same file , we can access default print function
        s1.print();
    }
}