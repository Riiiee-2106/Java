package lec27;

public class demo74 {



    public static void main(String[] args) {
  
        Box b1 = new Box(10);
        Box b2 = new Box("hello");


        // so we can not perform operations in these classes
        // we don't know what values object holds 
        // System.out.println(b1.getValue() +5);


        // Object too generic -->type specificity is lost
        // downcast

        Integer x = (Integer)b1.getValue();
        String y = (String)b2.getValue();
       
     
        System.out.println(x+5);
        System.out.println(y+" world");

}

}


// Object 
// if object is treated as a universal type
class Box{

    private Object value ;


    Box(Object value){
        this.value = value;
    }


    public Object getValue(){
        return this.value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}




// we need to downcast normally