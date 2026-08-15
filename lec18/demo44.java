package lec18;

public class demo44 {
    public static void main(String[] args) {
        

        
        int a = 100;
        int b = 100;
        System.out.println(a==b);


        Integer x = 200;
        Integer y = 200;
        System.out.println(x==y);
        System.out.println(x.intValue() == y.intValue());
        System.out.println(x.equals(y));
    }
}
