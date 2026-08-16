package lec26;

public class demo71 {

    public static void main(String[] args) {
        //  stringbuilder and stringbuffer methods


        StringBuilder sb = new StringBuilder();
    
        // append
    sb.append("Aditya");
    sb.append("tandom");

    System.out.println(sb);


    // insert
    sb.insert(2,'o');
    System.out.println(sb);


    // delete
    sb.delete(0, 2);
    System.out.println(sb);


    // replace
    System.out.println(sb.replace(0, 3, "hello"));


    // reverse
    System.out.println(sb.reverse());


    StringBuilder sb1 = new StringBuilder("hello world with java");
    // charAt
    System.out.println(sb1.charAt(0));

    // setCharAt
    sb1.setCharAt(2, 'm');


    // length
    System.out.println(sb1.length());

    System.out.println(sb1.capacity());

  sb1.ensureCapacity(65);
  System.out.println(sb1.capacity());
  sb1.trimToSize();
  System.out.println(sb1.capacity());*




}
    
}
