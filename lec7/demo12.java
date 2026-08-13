package lec7;

public class demo12 {
    public static void main(String[] args) {
        
        // switch statements
        int i = 3;

        switch(i){
            case 1: System.out.println("i is 1");
                    break;
            case 2: System.out.println("i is 2");
                    break;
            case 3: System.out.println("i is 3");
                    break;
            default:System.out.println("i is greater number than 3");
                    break;
        }


        // if break is not present all the values will get executed

        i=1;
          switch(i){
            case 1: System.out.println("i is 1");
                    
            case 2: System.out.println("i is 2");
                   
            case 3: System.out.println("i is 3");
                 
            default:System.out.println("i is greater number than 3");
                    break;
        }



        // nested switch -- again switch should not be nested more than 2 times , as it will get complex
        int num = 2;
        int num2 = 4;

        switch (num) {
            case 1: System.out.println("num is 1");
                    break;

            case 2: switch (num2) {
                case 1:System.out.println("num is 2 and num2 is 1");
                    
                    break;
                 case 2:System.out.println("num is 2 and num2 is 2");
                    
                    break;
                 case 3:System.out.println("num is 2 and num2 is 3");
                    
                    break;
                 case 4:System.out.println("num is 2 and num2 is 4");
                    
                    break;
               
            }
              break;
        
            default:System.out.println("num is greater than 2");
                break;
        }

    }
    
}
