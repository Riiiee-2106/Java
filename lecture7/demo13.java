package lecture7;

public class demo13 {

    public static void main(String[] args) {
        // SELECTION STATEMENT-

        //switch statements

        int i = 1;

        switch (i) {
            case 1:System.out.println("i is 1");
                break;
            case 2:System.out.println("i is 2");
                break;
            case 3:System.out.println("i is 3");
                break;
            default:System.out.println("i is a number");
                break;
        }


        // why break statement is used

        System.out.println("when break statement is removed");

         switch (i) {
            case 1:System.out.println("i is 1");
               
            case 2:System.out.println("i is 2");
               
            case 3:System.out.println("i is 3");
                
            default:System.out.println("i is a number");
                break;
        }


        System.out.println("all statements after correct statement gets executed");


    }
    
}
