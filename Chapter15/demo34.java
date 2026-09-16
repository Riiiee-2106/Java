package Chapter15;

public class demo34 {

    public static void main(String[] args) {
        
        //why we have String[]args as an argument within main function


        //earlier we used to use terminal to compile and run code 
        //so to give input we used string[]args


        System.out.println("numbers of arguments are: "+args.length);

        for(int i=0;i<args.length;i++){
            System.out.println("argument "+i+" = "+ args[i]);
        }


        //when we run code we can give output/input in console which can get stored in args

        //it was used for configurations  - like read from input.txt and give output.txt output

    }
    
}
