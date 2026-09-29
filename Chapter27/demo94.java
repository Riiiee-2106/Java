package Chapter27;
import java.util.*;
public class demo94{


    public static void main(String[] args) {
        // where to use <T> AND <?>

        Box<String> b1 = new Box<>();


    }


    public static<T>/*<?> this is not allowed*/void fun(T a,T b){
        
    }

}


class Box<T>  /*<?>this is not allowed - wildcards are allowed in generics in containers , means -when we want to denote one list by another  or change through another list */{
    T value;
}


// super and extends also we have understood it
