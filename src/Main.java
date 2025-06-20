//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,4,19};
        int a = 10;
        String name = "divyanshyadav";
//      System.out.println(name);
//      Imutability

        String b = "Divyansh";// this object isn't changed after sometime it
        // is collected to the garbage collection.
        System.out.println(b);
        b = "yadav";// this is the creation of new object. and point b
        // to that.
        // for security reasons we can't modify string objects.

        // how can we check multiple ref variable pointing to the same
        // object or different object.


        System.out.println(b);
    }
}