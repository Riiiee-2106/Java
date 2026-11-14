public class demo88{
    public static void main(String[] args) {
        Boxes<Integer> b1 = new Boxes<>(10);
        /*className<Datatype of placeholder> variable name --type argument */

      //  Boxes b2 = new Boxes(100); //this will act as Object 

        System.out.println("b1.getValue()+1");

        Boxes <String> s1 = new Boxes<>("hello world");

        Boxes <Boolean> s2 = new Boxes<>(false);
        
           System.out.println(b1.getValue()+1);
           System.out.println(s1.getValue()+"in java");
           System.out.println(b1.getValue()+"richa"); 
        //    System.out.println(b1.getValue().substring()); compile time errors only no runtime 
          // String s3 = s2; //compile time error
        //   String s4 = (String)b1;  still a compile time error


//so type information is not lost  - as we have passed value before telling the datatype of the values 

    }
}

class Boxes<T>{ //T IS A PLACEHOLDER HOLD A VALUE OF ANY DATATYPE , DATATYPE WILL BE DECLARED AT DECLARATION OF VALUE
    private T values;

    Boxes(T values){ //parameter
        this.values = values;
    }

    public T getValue(){
        return this.values;
    }

    public void setValue(T values){
        this.values = values;
    }
}


//instead of Object - because we need to downcast it manually - becoz it is risky ,if we dont know which value it holds --> give runtime exception we want compile time error as it is better
