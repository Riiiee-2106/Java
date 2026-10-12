package Chapter27;

public class demo88 {

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.value = 4;
        b1.printDouble();
       
    }
    
}


// bounds in generic 
// upperbound - T is atleast Number or its subtype


class Box <T extends Number>{//type parameter -- Number or its subtype
    T value;



    public void printDouble() {
        // System.out.println(value.getDouble()); 
                        // |
                        // |
                        // |
                        // v
        //   value is of type T , we dont know wht T stands for as of now ,it will be decided when object gets created

        // i can only call object  class method
        // System.out.println(value.hashCode());



        // so we use bounds in generic
            System.out.println(value.doubleValue());
    }

    }

