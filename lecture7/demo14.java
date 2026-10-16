package lecture7;

public class demo14 {

    // nested switch

    public static void main(String[] args) {
        
    
    int i = 10;
    int j = 20;

    switch(i){
        case 10: 
            switch(j){
            case 10: System.out.println("i is 10 and j is 10");
                    break;
            case 20: System.out.println("i is 10 and j is 20");
                    break;
                }
                break;
        case 20:System.out.println("i is 20");
                break;
        default:System.out.println("i is a number");
                break;
    }
    
}

}