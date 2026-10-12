package lecture6;

public class demo9 {

    public static void main(String[] args) {
        // LOGICAL OPERATOR - &&,||

        int num1 = 10;
        int num2 = 20;
        int num3 = 25;

        System.out.println((num1<num2)&&(num2<num3));
        System.out.println((num1<num2)&&(num2>num3));
        System.out.println((num1<num2)||(num2>num3));
        System.out.println((num2<num3)|(num3>num1));  //bitwise operator does not support short circuiting

    }
    
}
