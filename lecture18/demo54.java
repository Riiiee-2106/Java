public class demo54 {

    public static void main(String[] args) {
        

        int x = 100;
        int y = 100;
        System.out.println(x==y); //true

        Integer x1 = 200;
        Integer y1 = 200;
        System.out.println(x1==y1); //false - if x1 and y1 points to same reference

        System.out.println(x1.intValue() == y1.intValue()); //true
        System.out.println(x1.equals(y1)); //true




    }
    
}
