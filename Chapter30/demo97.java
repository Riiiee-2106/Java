package Chapter30;
import java.util.*;

public class demo97{
    

    public static void main(String[] args) {
        // concurrent modification exception

        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer>it = list.iterator();

        while(it.hasNext()){
            int value = it.next();
            if(value == 3){
                list.remove(value);  //remove method of list is used not of iterator,there fore comes an exception , Iterator remove() does not take any args and remove last traversed element and is safe
                

                // iterator dont know how to deal with it - as it can be any datastructure .
                 
            }
            System.out.println(value);
        }
    }
}