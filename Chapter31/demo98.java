package Chapter31;
import  java.util.*;
public class demo98 {
    

// all method of collection
    public static void main(String[] args) {
        
        Collection <Integer>c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);

        // size()
        int n = c.size();
        System.out.println(n);


        System.out.println(c.isEmpty()); //c.size()==0 ,can be used but isEmpty() is more optimized


        // boolean contains(Object obj)  -->collection dont know which datastructure is coming , so we use object

        System.out.println(c.contains(2)); //--> internally calls .equals which is present in Object class , each datastructure contains time complexity will be different .

        // Object toArray();

       Object [] obj =  c.toArray();

       for(Object o:obj){
        System.out.println(o);
       }


    //    T[] toArray()

    Integer[]arr = c.toArray(new Integer[2]);
    arr[0] = 10;
    arr[1] = 11;

    for(int a:arr){
        System.out.println(a);
    }

//add()
    boolean c1 = c.add(4);  //boolean return type 
    System.out.println(c1);//true
    boolean c2 = c.add(4);
    System.out.println(c2);//false


    //remove() -->takes Object obj  , compare element which takes equals() comes from Object

    System.out.println(c.remove(4));  //true -boolean

    //if duplicate element present remove removes the first occurence


    c.addAll(List.of(4,5,6,7,8));

    System.out.println(c);  //collection overrided toString()

    //boolean containsAll(Collection<?>c)
    System.out.println(c.containsAll(List.of(2,3,4)));

    //removeAll(Collection<?>c)
    System.out.println(c.removeAll(List.of(4)));

    //retainAll(Collection<?>c) -->intersection
    System.out.println(c.retainAll(List.of(1,2)));

    System.out.println(c);


    c.clear();
    System.out.println(c);




//collection .equals()  - value compare overriden
// hashCode() - overriden (law of equality maintained)



    }
}
