package Chapter26;

public class demo82 {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Aditya");
        sb.append(" Tandon");


        // insert()
        sb.insert(1,'m');
        System.out.println(sb);

        // delete()
        sb.delete(2,3);
        System.out.println(sb);

        // deleteCharAt
        sb.deleteCharAt(1);

        // replace()
        sb.replace(1,2,"di");
        System.out.println(sb);

        // reverse()
        System.out.println(sb.reverse());

        // charAt()
        System.out.println(sb.charAt(2));

        sb =new StringBuilder("Amitya Tandon");


        // setCharAt()
       sb.setCharAt(1, 'd');
       System.out.println(sb);

    //    length()
    System.out.println(sb.length());//13

    // trimToSize()
    System.out.println(sb.capacity()); //16+13 = 29
    sb.trimToSize(); //13

    // ensureCapacity()
    System.out.println(sb.capacity());
    sb.ensureCapacity(68);//68
     System.out.println(sb.capacity());

    



      






    }
    
}
