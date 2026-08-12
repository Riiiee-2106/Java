package lec6;

public class demo9 {
    public static void main(String[] args) {
        // logical operator

        int a = 5;
        int b = 6;
        int c = 15;

        System.out.println((a<b)&&(b<c));
        System.out.println((a<b)&&(a>c));
        System.out.println(a<b || c<a);
        System.out.println(a<b | b<c);
    }
    
}
