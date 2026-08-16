package lec27;

public class demo73 {

    public static void main(String[] args) {
        Box b1 = new Box(10);
        b1.getValue();

        Box1 b2 = new Box1("hello");
        b2.getValue();
        
    }
    
    // problem for each datatype we had to make different classes
}


class Box{

    private int value ;


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



class Box1{

    private String value ;


    Box1(String value){
        this.value = value;
    }


    public String getValue(){
        return this.value;
    }

    public void setValue(String value){
        this.value = value;
    }
}