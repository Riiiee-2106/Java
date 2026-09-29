package Chapter30;
import java.util.*;
public class demo96{

    public static void main(String[] args) {

        // iterator code is verbous

        // so we use mostly enhanced for loop  or called for each loop

        // iterator code sugarcoated

        String []names = {"Aditya","Rohit","Rohan","Monu"};
        NameContainer container = new NameContainer(names);

        Iterator<String>it = container.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }



        // enhanced for loop - converted to iterator code
        for(String name:container){
            System.out.println(name);
        }
    }

    // so if we dont have iterator code implemented by Namecontainer - it pass error --> needs to implement iterable interface and iterator  

}



class NameContainer implements Iterable<String>{
    private String []names;
    private int size;


    NameContainer(String[]names){
        this.names = names;
        this.size = this.names.length;

    }

    @Override 
    public Iterator<String>iterator(){
        return new /*NameContainerIterator();*/ Iterator<String>() { //as single usage so made anonymous class instead

            
       


    /*private class NameContainerIterator implements  Iterator<String>{*/
        private int pos = 0;


    @Override 
    public boolean hasNext(){
        return (pos<size);
    }

    @Override
    public String next(){
        return names[pos++];
    }

};
    }

}