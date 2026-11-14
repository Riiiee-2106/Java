public class demo85{
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("aditya");
        sb.append(" tandon");

        //insert()
        sb.insert(6," surname is ");
        System.out.println(sb);

        //delete
        sb.delete(6,17);
        System.out.println(sb);

        //deleteCharAt
        sb.deleteCharAt(2);

        //replace
        StringBuilder sb2  = new StringBuilder("aditya tandon");
          sb2.replace(0, 5, "richa");
        System.out.println(sb2);

        System.out.println(sb2.reverse());
        sb.charAt(1);
        sb.setCharAt(3, 'r');
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("tandon is my name. age is 34");
        System.out.println(sb.capacity());

        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        sb.trimToSize();
        System.out.println(sb.capacity());

        
    }
}