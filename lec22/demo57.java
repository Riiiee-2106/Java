package lec22;

import java.util.Objects;

public class demo57 {

    public static void main(String[] args)throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.name = "richa";
        s1.age = 21;

        System.out.println(s1); //no need to write toString as println bydefault  implement toString
        //                ClassName@Hexcode


          Student s2 = new Student();
        s2.name = "richa";
        s2.age = 21;


        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.hashCode() == s2.hashCode());


        // Student s3;
        // System.out.println(s1.equals(s3));  null pointer exception


        //     Integer i = 28; 
        // System.out.println(s1.equals(i));  classcastException



        // getclass
       System.out.println( s1.getClass().getName());   //---exact runtimeclasss --getclass-is a method


    //    instance Of
    Animal a = new Animal();
    Animal b = new Dog();

    System.out.println(a instanceof Animal); //--instance of is an operator
    System.out.println(a instanceof Dog); //-- 
    System.out.println(b instanceof Dog); //-- 
    System.out.println(b instanceof Dog); //--checks if object belongs to a class or a subclass

    System.out.println(a.getClass().getName());
    System.out.println(b.getClass().getName());


        Student s3 =(Student) s1.clone();

        System.out.println(s3);
    }
}



// override toString method of object
    class Student implements Cloneable{
        String name ;
        int age;

       @Override
       public String toString(){
        return name+" "+age;
       }



 // override .equals
       
@Override
public boolean equals(Object obj){


     if(obj == this ){
        return true;
     }

    //  if class is null
    if(obj == null)
        return false;


    // both classes are of same type
    if(obj.getClass() != this.getClass()){
        return false;
    }
   
    Student s = (Student) obj;

    return this.name == s.name && this.age == s.age;

}




// if equals was never overriden then hashcode will work perfectly 

// but as equals was overriden then we have to override hashcode
    

@Override
public int hashCode() {
    // int res = 17;
    // res = res*31+age;
    // res = res*31+((name==null)?0:name.hashCode());
    // return res;


    return Objects.hash(name,age);
}



protected Object clone()throws CloneNotSupportedException{
    return super.clone();
}
    }
    






class Animal{
    String name;
    void walk(){

    }
}


class Dog extends Animal{
    @Override
    void walk(){

    }
}