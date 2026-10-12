package Chapter18;

public class demo49 {


    public static void main(String[] args) {
        

        // ==  // .equals
        int x1 = 100;
        int y1 = 100;

        System.out.println(x1==y1);

       
        Integer x = 200;
        Integer y = 200;

        System.out.println(x==y);  //reference compare
        System.out.println(x.intValue() == y.intValue());
        System.out.println(x.equals(y));
    }
    
}
