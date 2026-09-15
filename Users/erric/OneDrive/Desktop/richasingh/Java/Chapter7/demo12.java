package Chapter7;

public class demo12 {
    
    public static void main(String[] args) {
        int i= 5;
        int j = 1;

        switch(i){
            case 1:System.out.println("i is 1");
                    break;
            case 2:System.out.println("i is 2");
                    break;
            case 3:System.out.println("i is 3");
                    break;
            case 4:System.out.println("i is 4");
                    break;
            case 5:switch (j) {
                case 1:System.out.println("i is 5 and j is 1");
                    
                    break;
            
                default:System.out.println("i dont know");
                    break;
            }break;
            default:System.out.println("i dont know");
                break;
        }

        // we should not nest switch more then two three layers
    
    }
}

