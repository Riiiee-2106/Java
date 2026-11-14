public class demo87{
    public static void main(String[] args) {
        

        //problems in java which lead to generics
        Box b = new Box(10);
        System.out.println(b.getValue());

        //what of i want box to hold a string for that we have to define a class with string intrinsic property's

        Box2 b2 = new Box2("hello");
        System.out.println(b2.getValue() );

        Boxes b3 = new Boxes("some value");
        Boxes b4 = new Boxes(10);
        Boxes b5 = new Boxes(true);
      //  System.out.println(b3.getValue()+10); //this will give error as we dont know which value is Object values really holds - compile time error



        //object -->too generic , type information can be lost
        //we need to do downcasting

        Integer x = (Integer)b4.getValue();
        String s = (String) b3.getValue();
        Boolean z = (boolean)b5.getValue();


        System.out.println(x+500);
        System.out.println(s+" world");
        System.out.println(z);






    }
}

//my goal is to create a generic class which can store all datatype value

class Boxes{
    private Object values;

    Boxes(Object values){
        this.values = values;
    }

    public Object getValue(){
        return this.values;
    }

    public void setValue(Object values){
        this.values = values;
    }
}


//instead of Object - because we need to downcast it manually - becoz it is risky ,if we dont know which value it holds --> give runtime exception we want compile time error as it is better


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


class Box2{
   private String value;

   Box2(String value){
    this.value = value;
   }

   public String getValue(){
    return this.value;
   }

   public void setValue(String value){
    this.value = value;
   }

}