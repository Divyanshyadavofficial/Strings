public class Comparison {
    public static void main(String[] args) {
        String a = "Div";
        String b = "Div";
        System.out.println(a==b);// this will give true
        // comaprison of strings
        // == method
        // if a is pointing to kunal and if b is pointing to another object
        // kunal in this case == will give false

        // this == checks if the two ref variable points to the same object or not
        // if they point to this will return true.

        // how to create diff objects of same value
        String c= new String("div");
        String d = new String("div");
        // creating these values outside the pool but in heap
        // now if we do a c == d this will give false.
        System.out.println(c==d);

        // when you only need to check value,use equals method
        System.out.println(c.equals(d));
//      System.out.println(a[0]); we cannot do this in strings.
        // we have to use a method .charAt
        System.out.println(a.charAt(0));

    }
}
