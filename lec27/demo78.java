package lec27;

public class demo78 {

    public static void main(String[] args) {
        Integer x = 3;
        // Double d = 4;

        // Box<String> b1 = new Box<>(); we cant pass any datatype in this until its from same generic T extending class

        Box<Integer> b1  = new Box<>();


        
    }
    
}


// bounds in generic
// upperbound
// before T canbe anything
// after upperbound T needs to be Number or subtype 

class Box<T extends Number>{

    T value;

    public T getValue(){
        return this.value;
    }

    public void setValue(){
        this.value = value;
    }

    public void print(){
        // we cant call methods until the type of T is passed
        System.out.println(value.doubleValue());
        // we can pass number and its subtype methods only when T is extending Numbers
        // or we can pass any method only when T is extending some class
    }
}