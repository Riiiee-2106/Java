package Chapter27;

public class demo84 {
    

    public static void main(String[] args) {
        
        Box b1 = new Box(10);
        System.out.println(b1.getValue());
        b1.setValue(100);
        System.out.println(b1.getValue());


        // Box box = new Box("box");  i cannot store string in box class 

        Box2 b2 = new Box2("hello");
        Box2 b3 = new Box2(10);

        // System.out.println(b2.getValue()+5); compiler error - as java dont know which datatype is being stored within Object value, so how will it be performing calculations in it

        // for this we need to do downcast

        // String s = (String)b3.getValue(); -->runtime exception
        Integer x= (Integer)b3.getValue();
        String y = (String)b2.getValue();
        System.out.println(x+5);
        System.out.println(y+" richa");
        
        // downcasting is a bit risky - when we dont know what it stores - we can get runtime exception - classcastexception


    }
}



class Box{
    private int value;

    Box(int value){
        this.value = value;
    }


    public int getValue(){
        return this.value;
    }


    public void setValue(int value){
        this.value = value;
    }
}



// we can make different classes to hold different datatype within box class

/* 
class Box2{
    String value;

    Box2(String value){
        this.value = value;
    }
}
    */


// instead of making different classes for different datatype - we can use object
class Box2{
    Object value;

    Box2(Object value){
        this.value = value;
    }

    public Object getValue(){
        return value;
    }

    public void setValue(){
        this.value = value;
    }
}