package lecture15;

//use of String []args
public class demo36 {

    public static void main(String[] args) {
        /*why (String[]args) -> to give input earlier, we use this */

        System.out.println("number of arguments "+args.length);

        for(int i =0;i<args.length;i++){
            System.out.println("Argument "+i+" = "+args[i]+" ");
        }

        /*used in configurations - read from input.txt 
        output give in output.txt  ...etc
        we give configurations internally */
    }
    
}
