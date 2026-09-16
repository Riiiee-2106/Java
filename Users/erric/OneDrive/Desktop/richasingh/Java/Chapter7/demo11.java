package Chapter7;

public class demo11 {

    public static void main(String[] args) {
        // switch statements

        int i =3;
        switch(i){
            case 1:System.out.println("i is 1");
                    break;
            case 2:System.out.println("i is 2");
                    break;
            case 3:System.out.println("i is 3");
                    break;
            default : System.out.println("i is some number");
                    break;
        }



        // why break is used?

        //when we use break - all the statements after the correct statement gets executed without even evaluating its correctness
        i=1;
          switch(i){
            case 1:System.out.println("i is 1");
               
            case 2:System.out.println("i is 2");
                
            case 3:System.out.println("i is 3");
                    
            default : System.out.println("i is some number");
                    break;
        }
    }
    
}
