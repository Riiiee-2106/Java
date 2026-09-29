package Chapter30;

import java.util.*;
public class demo95{

    // Iterable interface


    public static void main(String[] args) {
        
    List<Integer>list = new ArrayList<>(); //it can be Linkedlist ,arraylist,any collection datastructure


    /*

    we can also write -
    Collection <Integer> c = new LinkedList<>(); 
                        or
    Collection <Integer> c = new HashSet<>(); 
    output can be in any order but there is no need to change the below code  - O(1) searching tranversal of element

                        or
    Collection <Integer> c = new ArrayDeque<>();
                        or
    Collection <Integer> c = new TreeSet<>();
    etc...
     */
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);


    // there is no need to change anything in code
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next()); //it also shift to next position and give element

        }
    

}


}